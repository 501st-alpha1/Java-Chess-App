import java.awt.*;
import javax.swing.*;

public class Knight extends Piece {  
  public Knight() {
    super();
  }
  
  public Knight(int x, int y, int width) {
    super(x, y, width);
  }
  
  public Knight(int x, int y, int w, int team) {
    super(x, y, w, team);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if ((((dy == -2) && (dx == -1)) || ((dy == -2) && (dx == 1)) || ((dy == -1) && (dx == 2)) || ((dy == 1) && (dx == 2))
        || ((dy == 2) && (dx == 1)) || ((dy == 2) && (dx == -1)) || ((dy == 1) && (dx == -2)) || ((dy == -1) && (dx == -2)))
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
    this.piece.reset();
    this.piece.addPoint(x - (int)(w * 0.3), y + (int)(w * 0.5));
    this.piece.addPoint(x - (int)(w * 0.25), y + (int)(w * 0.4));
    this.piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.0));
    this.piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.1));
    this.piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.3));
    this.piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.4));
    this.piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.47));
    this.piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.46));
    this.piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.35));
    this.piece.addPoint(x + (int)(w * 0.4), y - (int)(w * 0.25));
    this.piece.addPoint(x + (int)(w * 0.38), y - (int)(w * 0.0));
    this.piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.1));
    this.piece.addPoint(x + (int)(w * 0.25), y + (int)(w * 0.4));
    this.piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5));
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if ((((dy == -2) && (dx == -1)) || ((dy == -2) && (dx == 1)) || ((dy == -1) && (dx == 2)) || ((dy == 1) && (dx == 2))
        || ((dy == 2) && (dx == 1)) || ((dy == 2) && (dx == -1)) || ((dy == 1) && (dx == -2)) || ((dy == -1) && (dx == -2)))
        && (Game.board[newX - 1][newY - 1] != null) && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    else {
      return false;
    }
  }
}
