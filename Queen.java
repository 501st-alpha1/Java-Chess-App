public class Queen extends Piece {
  public Queen() {
    super();
  }
  
  public Queen(int x, int y, int w) {
    super(x, y, w);
    this.setPolygon();
  }
  
  public Queen(int x, int y, int w, int team) {
    super(x, y, w, team);
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
    else if (dx == 0) {
      if (dy > 0) {
        for (int i = 1; i <= dy; i++) {
          if (Game.board[oldX - 1][oldY + i - 1] != null) {
            return false;
          }
        }
        return true;
      }
      else {
        for (int i = -1; i >= dy; i--) {
          if (Game.board[oldX - 1][oldY + i - 1] != null) {
            return false;
          }
        }
        return true;
      }
    }
    else if (dy == 0) {
      if (dx > 0) {
        for (int i = 1; i <= dx; i++) {
          if (Game.board[oldX + i - 1][oldY - 1] != null) {
            return false;
          }
        }
        return true;
      }
      else {
        for (int i = -1; i >= dx; i--) {
          if (Game.board[oldX + i - 1][oldY - 1] != null) {
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
    this.piece = Polygons.setPolygon(w, x, y, Polygons.QUEEN);
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY, Team team) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    int a;
    int b;
    
    if (dx > 0) {
      a = newX - 1;
    }
    else if (dx < 0) {
      a = newX + 1;
    }
    else {
      a = newX;
    }
    
    if (dy > 0) {
      b = newY - 1;
    }
    else if (dy < 0) {
      b = newY + 1;
    }
    else {
      b = newY;
    }
    
    if (this.getValidSquares(oldX, oldY, a, b, null) && (Game.board[newX - 1][newY - 1] != null)
        && (Game.board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    
    return false;
  }
}
