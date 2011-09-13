public class Team {
  public King king;
  public Queen queen;
  public Bishop bishopWest;
  public Bishop bishopEast;
  public Knight knightWest;
  public Knight knightEast;
  public Rook rookWest;
  public Rook rookEast;
  public Piece pawn1;
  public Piece pawn2;
  public Piece pawn3;
  public Piece pawn4;
  public Piece pawn5;
  public Piece pawn6;
  public Piece pawn7;
  public Piece pawn8;
  public int color;
  
  public final static int WHITE = 0;
  public final static int BLACK = 1;
  
  //Create new pieces and place them in their proper position, depending on the
  //team color.
  public Team(int color) {
    this.color = color;
    if (color == WHITE) {
      this.king = new King(5, 8, 40, Piece.WHITE);
      this.queen = new Queen(4, 8, 40, Piece.WHITE);
      this.rookWest = new Rook(1, 8, 40, Piece.WHITE);
      this.rookEast = new Rook(8, 8, 40, Piece.WHITE);
      this.knightWest = new Knight(2, 8, 40, Piece.WHITE);
      this.knightEast = new Knight(7, 8, 40, Piece.WHITE);
      this.bishopWest = new Bishop(3, 8, 40, Piece.WHITE);
      this.bishopEast = new Bishop(6, 8, 40, Piece.WHITE);
      this.pawn1 = new Pawn(1, 7, 40, Piece.WHITE);
      this.pawn2 = new Pawn(2, 7, 40, Piece.WHITE);
      this.pawn3 = new Pawn(3, 7, 40, Piece.WHITE);
      this.pawn4 = new Pawn(4, 7, 40, Piece.WHITE);
      this.pawn5 = new Pawn(5, 7, 40, Piece.WHITE);
      this.pawn6 = new Pawn(6, 7, 40, Piece.WHITE);
      this.pawn7 = new Pawn(7, 7, 40, Piece.WHITE);
      this.pawn8 = new Pawn(8, 7, 40, Piece.WHITE);
    }
    if (color == BLACK) {
      this.king = new King(5, 1, 40, Piece.BLACK);
      this.queen = new Queen(4, 1, 40, Piece.BLACK);
      this.rookWest = new Rook(8, 1, 40, Piece.BLACK);
      this.rookEast = new Rook(1, 1, 40, Piece.BLACK);
      this.knightWest = new Knight(7, 1, 40, Piece.BLACK);
      this.knightEast = new Knight(2, 1, 40, Piece.BLACK);
      this.bishopWest = new Bishop(6, 1, 40, Piece.BLACK);
      this.bishopEast = new Bishop(3, 1, 40, Piece.BLACK);
      this.pawn1 = new Pawn(1, 2, 40, Piece.BLACK);
      this.pawn2 = new Pawn(2, 2, 40, Piece.BLACK);
      this.pawn3 = new Pawn(3, 2, 40, Piece.BLACK);
      this.pawn4 = new Pawn(4, 2, 40, Piece.BLACK);
      this.pawn5 = new Pawn(5, 2, 40, Piece.BLACK);
      this.pawn6 = new Pawn(6, 2, 40, Piece.BLACK);
      this.pawn7 = new Pawn(7, 2, 40, Piece.BLACK);
      this.pawn8 = new Pawn(8, 2, 40, Piece.BLACK);
    }
  }

}
