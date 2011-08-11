import java.awt.*;
import javax.swing.*;

public class Pawn extends Piece {
  public Pawn() {
    super();
  }
  
  public Pawn(int x, int y, int w) {
    super(x, y, w);
    this.setPolygon();
  }
  
  public Pawn(int x, int y, int w, int team) {
    super(x, y, w, team);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (team.color == Team.WHITE) {
      if ((dx == 0) && (dy == -1) && Game.board[newX - 1][newY - 1] == null) {
        return true;
      }
      else if (((dx == 0) && (oldY == 7) && (newY == 5)) && Game.board[newX - 1][newY - 1] == null && Game.board[newX - 1][newY - 2] == null) {
        return true;
      }
      else {
        return false;
      }
    }
    else {
      if ((dx == 0) && (dy == 1) && Game.board[newX - 1][newY - 1] == null) {
        return true;
      }
      else if (((dx == 0) && (oldY == 2) && (newY == 4)) && Game.board[newX - 1][newY - 1] == null && Game.board[newX - 1][newY - 2] == null) {
        return true;
      }
      else {
        return false;
      }
    }
  }
  
  public void setPolygon() {
    int w = super.getWidth();
    int x = super.getX() * w - w / 2;
    int y = super.getY() * w - w / 2;
    w = (int)(w * 0.8);
    this.piece = Polygons.setPolygon(w, x, y, Polygons.PAWN);
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (team.color == Team.WHITE) {
      if (((dx == 1) || (dx == -1)) && (dy == -1) && (Game.board[newX - 1][newY - 1] != null)
          && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
        return true;
      }
    }
    else {
      if (((dx == 1) || (dx == -1)) && (dy == 1) && (Game.board[newX - 1][newY - 1] != null)
          && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
        return true;
      }
    }
    
    return false;
  }
}
