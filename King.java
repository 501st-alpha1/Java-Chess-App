import java.awt.*;
import javax.swing.*;

public class King extends Piece {
  public King() {
    super();
  }
  
  public King(int x, int y, int w) {
    super(x, y, w);
    this.setPolygon();
  }
  
  public King(int x, int y, int w, int team) {
    super(x, y, w, team);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (((dy == -1) || (dy == 0) || (dy == 1)) && ((dx == -1) || (dx == 0) || (dx == 1))
        && (Game.board[newX - 1][newY - 1] == null)) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public void setPolygon() {
    int w = super.getWidth();
    int x = super.getX() * w - w / 2;
    int y = super.getY() * w - w / 2;
    w = (int)(w * 0.9);
    this.piece = Polygons.setPolygon(w, x, y, Polygons.KING);
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (((dy == -1) || (dy == 0) || (dy == 1)) && ((dx == -1) || (dx == 0) || (dx == 1))
        && (Game.board[newX - 1][newY - 1] != null) && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    else {
      return false;
    }
  }
}
