import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Chess extends JPanel {
  Game p1;
  //OptionPanel p2;
  private int side;
  
  //Set up frame or applet. TODO: Applet doesn't work with object tag.
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    Chess panel = new Chess();
    frame.add(panel);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Chess");
    frame.setVisible(true);
  }
  
  //TODO: For object tag, work in progress
//  public void init() {
//    try {
//      SwingUtilities.invokeAndWait(new Runnable() {
//        public void run() {
//          p1 = new Checkerboard();
//          add(p1);
//          p1.addMouseListener(new MoveListener());
//        }this.side
//      });
//    }
//    catch (Exception e) {
//      System.err.println("Fail!");
//    }
//  }

  //Create new checkerboard panel; add it and listener to frame.
  public Chess() {
    p1 = new Game();
    //p2 = new OptionPanel();
    
    this.add(p1);
    this.addMouseListener(new MoveListener());
  }
  
  //If the mouse clicked on a square, process it.
  public void processClick(int xPoint, int yPoint) {
    int x = xPoint / side + 1; //Get square number for x, starting at 1
    int y = yPoint / side + 1; //Get square number for y, starting at 1
    boolean valid = false;
    
    if ((x > 8) || (y > 8)) {
      p1.setCurrentX(0);
      p1.setCurrentY(0);
      valid = true;
    }
    if ((x == p1.getCurrentX()) && (y == p1.getCurrentY())) {
      p1.setCurrentX(0);
      p1.setCurrentY(0);
      valid = true;
    }
    
    for (int i = 0; i < p1.white.pieces.size(); i++) {
      if ((p1.white.pieces.get(i).getX() == p1.getCurrentX()) && (p1.white.pieces.get(i).getY() == p1.getCurrentY())) {
        p1.processMove(p1.white.pieces.get(i), x, y, p1.white);
        valid = true;
        break;
      }
    }
    for (int i = 0; i < p1.black.pieces.size(); i++) {
      if ((p1.black.pieces.get(i).getX() == p1.getCurrentX()) && (p1.black.pieces.get(i).getY() == p1.getCurrentY())) {
        p1.processMove(p1.black.pieces.get(i), x, y, p1.black);
        valid = true;
        break;
      }
    }
    
    if (!valid) {
      p1.setCurrentX(x);
      p1.setCurrentY(y);
    }
    
    repaint();
  }
  
  //Paint the checkerboard and the pieces.
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //Get the width of each square
    if (this.getWidth() > this.getHeight()) {
      side = this.getHeight() / 8;
    }
    else {
      side = this.getWidth() / 8;
    }
    
    //Draw squares
    boolean isWhite = true;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (isWhite) {
          g.setColor(Color.WHITE);
          isWhite = false;
        }
        else {
          g.setColor(new Color(20, 190, 20));
          isWhite = true;
        }
        g.fillRect((i * side), (j * side), side, side);
      }
      
      if (i % 2 == 0) {
        isWhite = false;
      }
      else {
        isWhite = true;
      }
    }
    
    if ((p1.getCurrentX() != 0) && (p1.getCurrentY() != 0)) {
      g.setColor(Color.RED);
      g.fillRect((p1.getCurrentX() - 1) * side, (p1.getCurrentY() - 1) * side,
          side, side);
    }
    
    //Make sure everything is the right size
    Piece.setWidth(side);

    int width = side;
    for (int i = 0; i < p1.white.pieces.size(); i++) {
      Polygons.setPolygon(p1.white.pieces.get(i), width, p1.white.pieces.get(i).getType());
    }
    for (int i = 0; i < p1.black.pieces.size(); i++) {
      Polygons.setPolygon(p1.black.pieces.get(i), width, p1.black.pieces.get(i).getType());
    }

    //Draw the pieces
    g.setColor(Color.BLACK);
    if (p1.white.king.getStatus()) {
      g.fillPolygon(p1.white.king.piece);
    }
    else {
      System.out.println("Black is the winner!");
      System.exit(0);
    }
    for (int i = 1; i < p1.white.pieces.size(); i++) {
      if (p1.white.pieces.get(i).getStatus()) {
        g.fillPolygon(p1.white.pieces.get(i).piece);
      }
    }
    
    g.setColor(new Color(255, 0, 255));
    if (p1.black.king.getStatus()) {
      g.fillPolygon(p1.black.king.piece);
    }
    else {
      System.out.println("White is the winner!");
      System.exit(0);
    }
    for (int i = 1; i < p1.black.pieces.size(); i++) {
      if (p1.black.pieces.get(i).getStatus()) {
        g.fillPolygon(p1.black.pieces.get(i).piece);
      }
    }
  }
  
  class MoveListener implements MouseListener{
    //Watch for mouse clicks.
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      processClick(x, y);
    }

    public void mouseEntered(MouseEvent arg0) {
      // Do nothing
    }

    public void mouseExited(MouseEvent arg0) {
      // Do nothing
    }

    public void mousePressed(MouseEvent arg0) {
      // Do nothing
    }

    public void mouseReleased(MouseEvent arg0) {
      // Do nothing
    }
  }
  
//  class OptionPanel extends JPanel {
//    public OptionPanel() {
//      JRadioButton black = new JRadioButton("Black");
//      this.add(black);
//    }
//  }
}