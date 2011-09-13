public class King extends Piece {
  public King() {
    super();
    super.setType(Piece.KING);
  }
  
  public King(int x, int y, int w) {
    super(x, y, w);
    super.setType(Piece.KING);
  }
  
  public King(int x, int y, int w, int team) {
    super(x, y, w, team);
    super.setType(Piece.KING);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY,
      Team team, Piece[][] board) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (((dy == -1) || (dy == 0) || (dy == 1)) && ((dx == -1) || (dx == 0)
        || (dx == 1)) && (board[newX - 1][newY - 1] == null)) {
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
    
    if (((dy == -1) || (dy == 0) || (dy == 1)) && ((dx == -1) || (dx == 0)
        || (dx == 1)) && (board[newX - 1][newY - 1] != null)
        && (board[newX - 1][newY - 1].getTeam() != team.color)) {
      return true;
    }
    else {
      return false;
    }
  }
}
