import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Chess extends JApplet {
  Checkerboard p1;
  
  //Set up frame or applet. TODO: Applet doesn't work with object tag.
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    Chess applet = new Chess();
    applet.init();
    frame.add(applet);
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
//        }
//      });
//    }
//    catch (Exception e) {
//      System.err.println("Fail!");
//    }
//  }

  //Create new checkerboard panel; add it and listener to frame.
  public Chess() {
    p1 = new Checkerboard();
    this.add(p1);
    p1.addMouseListener(new MoveListener());
  }
  
  class MoveListener implements MouseListener{
    //Watch for mouse clicks.
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      p1.processClick(x, y);
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
}