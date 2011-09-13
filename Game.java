import javax.swing.JPanel;

class Game extends JPanel {
  public Team white = new Team(Team.WHITE);
  public Team black = new Team(Team.BLACK);
  private int currentX = 0;
  private int currentY = 0;
  private Team currentTeam = white;
  private Piece[][] board = new Piece[8][8];
  //An array to keep track of which piece is on which square. "null" means the
  //square is empty.
  
  public Game() {
    //Initialize piece positions.
    this.board[0][0] = black.rookEast;
    this.board[1][0] = black.knightEast;
    this.board[2][0] = black.bishopEast;
    this.board[3][0] = black.queen;
    this.board[4][0] = black.king;
    this.board[5][0] = black.bishopWest;
    this.board[6][0] = black.knightWest;
    this.board[7][0] = black.rookWest;
    this.board[0][1] = black.pawn1;
    this.board[1][1] = black.pawn2;
    this.board[2][1] = black.pawn3;
    this.board[3][1] = black.pawn4;
    this.board[4][1] = black.pawn5;
    this.board[5][1] = black.pawn6;
    this.board[6][1] = black.pawn7;
    this.board[7][1] = black.pawn8;
    
    this.board[0][7] = white.rookWest;
    this.board[1][7] = white.knightWest;
    this.board[2][7] = white.bishopWest;
    this.board[3][7] = white.queen;
    this.board[4][7] = white.king;
    this.board[5][7] = white.bishopEast;
    this.board[6][7] = white.knightEast;
    this.board[7][7] = white.rookEast;
    this.board[0][6] = white.pawn1;
    this.board[1][6] = white.pawn2;
    this.board[2][6] = white.pawn3;
    this.board[3][6] = white.pawn4;
    this.board[4][6] = white.pawn5;
    this.board[5][6] = white.pawn6;
    this.board[6][6] = white.pawn7;
    this.board[7][6] = white.pawn8;
  }
  
  //Make sure the move is valid, and execute. This need improvement too.
  public void processMove(Piece p, int x, int y, Team team) {
    if ((team == white) && (currentTeam == white)) {
      if ((p instanceof Pawn) &&
          (p.getValidSquares(currentX, currentY, x, y, team, this.board))
          && (y == 1)) {
        //Upgrade a pawn?
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        this.currentTeam = black;
        this.upgradePawn(p);
      }
      else if (p.getValidSquares(currentX, currentY, x, y, team, this.board)) {
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        this.currentTeam = black;
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team, this.board)) {
        this.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        this.currentTeam = black;
      }
      else {
        this.currentX = 0;
        this.currentY = 0;
      }
    }
    else if ((team == black) && (currentTeam == black)){
      if (p.getValidSquares(currentX, currentY, x, y, team, this.board)) {
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        this.currentTeam = white;
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team, this.board)) {
        this.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        this.currentTeam = white;
      }
      else {
        this.currentX = 0;
        this.currentY = 0;
      }
    }
    else {
      currentX = 0;
      currentY = 0;
    }
  }

  //Promote pawns to queens.
  public void upgradePawn(Piece p) {
    if (p == white.pawn1) {
      white.pawn1 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn2) {
      white.pawn2 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn3) {
      white.pawn3 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn4) {
      white.pawn4 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn5) {
      white.pawn5 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn6) {
      white.pawn6 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn7) {
      white.pawn7 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == white.pawn8) {
      white.pawn8 = new Queen(p.getX(), p.getY(), Piece.getWidth(), white.color);
    }
    else if (p == black.pawn1) {
      black.pawn1 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn2) {
      black.pawn2 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn3) {
      black.pawn3 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn4) {
      black.pawn4 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn5) {
      black.pawn5 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn6) {
      black.pawn6 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else if (p == black.pawn7) {
      black.pawn7 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
    else {
      black.pawn8 = new Queen(p.getX(), p.getY(), Piece.getWidth(), black.color);
    }
  }
  
  //this.board[x - 1][y - 1]
  
  public void setCurrentX(int x) {
    this.currentX = x;
  }
  
  public int getCurrentX() {
    return this.currentX;
  }

  public void setCurrentY(int y) {
    this.currentY = y;
  }
  
  public int getCurrentY() {
    return this.currentY;
  }

}
