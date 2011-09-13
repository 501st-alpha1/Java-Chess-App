public class Knight extends Piece {  
  public Knight() {
    super();
    super.setType(Piece.KNIGHT);
  }
  
  public Knight(int x, int y, int width) {
    super(x, y, width);
    super.setType(Piece.KNIGHT);
  }
  
  public Knight(int x, int y, int w, int team) {
    super(x, y, w, team);
    super.setType(Piece.KNIGHT);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY,
      Team team, Piece[][] board) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if ((((dy == -2) && (dx == -1)) || ((dy == -2) && (dx == 1)) || ((dy == -1)
        && (dx == 2)) || ((dy == 1) && (dx == 2)) || ((dy == 2) && (dx == 1))
        || ((dy == 2) && (dx == -1)) || ((dy == 1) && (dx == -2))
        || ((dy == -1) && (dx == -2)))
        && (board[newX - 1][newY - 1] == null)) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY,
      Team team, Piece[][] board) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if ((((dy == -2) && (dx == -1)) || ((dy == -2) && (dx == 1)) || ((dy == -1)
        && (dx == 2)) || ((dy == 1) && (dx == 2)) || ((dy == 2) && (dx == 1))
        || ((dy == 2) && (dx == -1)) || ((dy == 1) && (dx == -2))
        || ((dy == -1) && (dx == -2))) &&
        (board[newX - 1][newY - 1] != null)
        && (board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    else {
      return false;
    }
  }
}
