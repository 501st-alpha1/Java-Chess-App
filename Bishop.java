
public class Bishop extends Piece {
  public Bishop() {
    super();
  }
  
  public Bishop(int x, int y, int width) {
    super(x, y, width);
  }
  
  public Bishop(int x, int y, int width, int team) {
    super(x, y, width, team);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if ((dx == dy) || (dx == -dy)) {
      if ((dx > 0) && (dy > 0)) {
          for (int i = 1; i <= dx; i++) {
            if (Game.board[oldX + i - 1][oldY + i - 1] != null) {
              return false;
            }
          }
          return true;
      }
      else if ((dx > 0) && (dy < 0)) {
        for (int i = 1; i <= dx; i++) {
          if (Game.board[oldX + i - 1][oldY - i - 1] != null) {
            return false;
          }
        }
        return true;
      }
      else if ((dx < 0) && (dy > 0)) {
        for (int i = -1; i >= dx; i--) {
          if (Game.board[oldX + i - 1][oldY - i - 1] != null) {
            return false;
          }
        }
        return true;
      }
      else {
        for (int i = -1; i >= dx; i--) {
          if (Game.board[oldX + i - 1][oldY + i - 1] != null) {
            return false;
          }
        }
        return true;
      }
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
    this.piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.1));
    this.piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.15));
    this.piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.4));
    this.piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.45));
    this.piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.5));
    this.piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.5));
    this.piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.45));
    this.piece.addPoint(x + (int)(w * 0.0), y - (int)(w * 0.25));
    this.piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.40));
    this.piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.2));
    this.piece.addPoint(x + (int)(w * 0.25), y + (int)(w * 0.4));
    this.piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5)); 
  }

  
  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    int a, b = 0;
    
    if (dx > 0) {
      a = newX - 1;
    }
    else {
      a = newX + 1;
    }
    
    if (dy > 0) {
      b = newY - 1;
    }
    else {
      b = newY + 1;
    }
    
    if (this.getValidSquares(oldX, oldY, a, b, null) && (Game.board[newX - 1][newY - 1] != null)
        && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    
    return false;
  }
}
