import java.awt.*;

import javax.swing.*;

public class Exercise15_3 extends JFrame {
  public static void main(String[] args) {
    Exercise15_3 frame = new Exercise15_3();
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise15_3");
    frame.setVisible(true);
  }

  public Exercise15_3() {
    JPanel p1 = new Checkerboard();   
    this.add(p1);      
  }
}

class Checkerboard extends JPanel {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    boolean isWhite = true;
    
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (isWhite) {
          g.setColor(Color.WHITE);
          isWhite = false;
        }
        else {
          g.setColor(Color.BLACK);
          isWhite = true;
        }
        g.fillRect((i * getWidth() / 8), (j * getHeight() / 8), (getWidth() / 8), (getHeight() / 8));
      }
      
      if (i % 2 == 0) {
        isWhite = false;
      }
      else {
        isWhite = true;
      }
    }
  }
}
