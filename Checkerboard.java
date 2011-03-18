import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class Checkerboard extends JPanel {
  private Team white = new Team(Team.WHITE);
  private Team black = new Team(Team.BLACK);
  private int side;
  private int currentX = 0;
  private int currentY = 0;
  private Team currentTeam = white;
  
  public Checkerboard() {
    //Initialize piece positions.
    Game.board[0][0] = black.rookEast;
    Game.board[1][0] = black.knightEast;
    Game.board[2][0] = black.bishopEast;
    Game.board[3][0] = black.queen;
    Game.board[4][0] = black.king;
    Game.board[5][0] = black.bishopWest;
    Game.board[6][0] = black.knightWest;
    Game.board[7][0] = black.rookWest;
    Game.board[0][1] = black.pawn1;
    Game.board[1][1] = black.pawn2;
    Game.board[2][1] = black.pawn3;
    Game.board[3][1] = black.pawn4;
    Game.board[4][1] = black.pawn5;
    Game.board[5][1] = black.pawn6;
    Game.board[6][1] = black.pawn7;
    Game.board[7][1] = black.pawn8;
    
    Game.board[0][7] = white.rookWest;
    Game.board[1][7] = white.knightWest;
    Game.board[2][7] = white.bishopWest;
    Game.board[3][7] = white.queen;
    Game.board[4][7] = white.king;
    Game.board[5][7] = white.bishopEast;
    Game.board[6][7] = white.knightEast;
    Game.board[7][7] = white.rookEast;
    Game.board[0][6] = white.pawn1;
    Game.board[1][6] = white.pawn2;
    Game.board[2][6] = white.pawn3;
    Game.board[3][6] = white.pawn4;
    Game.board[4][6] = white.pawn5;
    Game.board[5][6] = white.pawn6;
    Game.board[6][6] = white.pawn7;
    Game.board[7][6] = white.pawn8;
  }
  
  //If the mouse clicked on a square, process it.
  public void processClick(int xPoint, int yPoint) {
    int x = xPoint / this.side + 1;
    int y = yPoint / this.side + 1;
    if ((x > 8) || (y > 8)) {
      currentX = 0;
      currentY = 0;
    }
    else if ((x == currentX) && (y == currentY)) {
      currentX = 0;
      currentY = 0;
    }
    else if ((white.king.getX() == currentX) && (white.king.getY() == currentY)) {
      processMove(white.king, x, y, white);
    }
    else if ((white.queen.getX() == currentX) && (white.queen.getY() == currentY)) {
      processMove(white.queen, x, y, white);
    }
    else if ((white.rookWest.getX() == currentX) && (white.rookWest.getY() == currentY)) {
      processMove(white.rookWest, x, y, white);
    }
    else if ((white.rookEast.getX() == currentX) && (white.rookEast.getY() == currentY)) {
      processMove(white.rookEast, x, y, white);
    }
    else if ((white.knightWest.getX() == currentX) && (white.knightWest.getY() == currentY)) {
      processMove(white.knightWest, x, y, white);
    }
    else if ((white.knightEast.getX() == currentX) && (white.knightEast.getY() == currentY)) {
      processMove(white.knightEast, x, y, white);
    }
    else if ((white.bishopWest.getX() == currentX) && (white.bishopWest.getY() == currentY)) {
      processMove(white.bishopWest, x, y, white);
    }
    else if ((white.bishopEast.getX() == currentX) && (white.bishopEast.getY() == currentY)) {
      processMove(white.bishopEast, x, y, white);
    }
    else if ((white.pawn1.getX() == currentX) && (white.pawn1.getY() == currentY)) {
      processMove(white.pawn1, x, y, white);
    }
    else if ((white.pawn2.getX() == currentX) && (white.pawn2.getY() == currentY)) {
      processMove(white.pawn2, x, y, white);
    }
    else if ((white.pawn3.getX() == currentX) && (white.pawn3.getY() == currentY)) {
      processMove(white.pawn3, x, y, white);
    }
    else if ((white.pawn4.getX() == currentX) && (white.pawn4.getY() == currentY)) {
      processMove(white.pawn4, x, y, white);
    }
    else if ((white.pawn5.getX() == currentX) && (white.pawn5.getY() == currentY)) {
      processMove(white.pawn5, x, y, white);
    }
    else if ((white.pawn6.getX() == currentX) && (white.pawn6.getY() == currentY)) {
      processMove(white.pawn6, x, y, white);
    }
    else if ((white.pawn7.getX() == currentX) && (white.pawn7.getY() == currentY)) {
      processMove(white.pawn7, x, y, white);
    }
    else if ((white.pawn8.getX() == currentX) && (white.pawn8.getY() == currentY)) {
      processMove(white.pawn8, x, y, white);
    }
    
    else if ((black.king.getX() == currentX) && (black.king.getY() == currentY)) {
      processMove(black.king, x, y, black);
    }
    else if ((black.queen.getX() == currentX) && (black.queen.getY() == currentY)) {
      processMove(black.queen, x, y, black);
    }
    else if ((black.rookWest.getX() == currentX) && (black.rookWest.getY() == currentY)) {
      processMove(black.rookWest, x, y, black);
    }
    else if ((black.rookEast.getX() == currentX) && (black.rookEast.getY() == currentY)) {
      processMove(black.rookEast, x, y, black);
    }
    else if ((black.knightWest.getX() == currentX) && (black.knightWest.getY() == currentY)) {
      processMove(black.knightWest, x, y, black);
    }
    else if ((black.knightEast.getX() == currentX) && (black.knightEast.getY() == currentY)) {
      processMove(black.knightEast, x, y, black);
    }
    else if ((black.bishopWest.getX() == currentX) && (black.bishopWest.getY() == currentY)) {
      processMove(black.bishopWest, x, y, black);
    }
    else if ((black.bishopEast.getX() == currentX) && (black.bishopEast.getY() == currentY)) {
      processMove(black.bishopEast, x, y, black);
    }
    else if ((black.pawn1.getX() == currentX) && (black.pawn1.getY() == currentY)) {
      processMove(black.pawn1, x, y, black);
    }
    else if ((black.pawn2.getX() == currentX) && (black.pawn2.getY() == currentY)) {
      processMove(black.pawn2, x, y, black);
    }
    else if ((black.pawn3.getX() == currentX) && (black.pawn3.getY() == currentY)) {
      processMove(black.pawn3, x, y, black);
    }
    else if ((black.pawn4.getX() == currentX) && (black.pawn4.getY() == currentY)) {
      processMove(black.pawn4, x, y, black);
    }
    else if ((black.pawn5.getX() == currentX) && (black.pawn5.getY() == currentY)) {
      processMove(black.pawn5, x, y, black);
    }
    else if ((black.pawn6.getX() == currentX) && (black.pawn6.getY() == currentY)) {
      processMove(black.pawn6, x, y, black);
    }
    else if ((black.pawn7.getX() == currentX) && (black.pawn7.getY() == currentY)) {
      processMove(black.pawn7, x, y, black);
    }
    else if ((black.pawn8.getX() == currentX) && (black.pawn8.getY() == currentY)) {
      processMove(black.pawn8, x, y, black);
    }
    else {
      currentX = x;
      currentY = y;
    }
    //There must be *some* better way to do that!
    
    repaint();
  }

  //Make sure the move is valid, and execute. This need improvement too.
  public void processMove(Piece p, int x, int y, Team team) {
    if ((team == white) && (currentTeam == white)) {
      if ((p instanceof Pawn) && (p.getValidSquares(currentX, currentY, x, y, team)) && (y == 1)) {
        p.setX(x);
        p.setY(y);
        Game.board[x - 1][y - 1] = p;
        Game.board[currentX - 1][currentY - 1] = null;
        currentX = 0;
        currentY = 0;
        currentTeam = black;
        this.upgradePawn(p);
      }
      else if (p.getValidSquares(currentX, currentY, x, y, team)) {
        p.setX(x);
        p.setY(y);
        Game.board[x - 1][y - 1] = p;
        Game.board[currentX - 1][currentY - 1] = null;
        currentX = 0;
        currentY = 0;
        currentTeam = black;
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team)) {
        Game.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        Game.board[x - 1][y - 1] = p;
        Game.board[currentX - 1][currentY - 1] = null;
        currentX = 0;
        currentY = 0;
        currentTeam = black;
      }
      else {
        currentX = 0;
        currentY = 0;
      }
    }
    else if ((team == black) && (currentTeam == black)){
      if (p.getValidSquares(currentX, currentY, x, y, team)) {
        p.setX(x);
        p.setY(y);
        Game.board[x - 1][y - 1] = p;
        Game.board[currentX - 1][currentY - 1] = null;
        currentX = 0;
        currentY = 0;
        currentTeam = white;
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team)) {
        Game.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        Game.board[x - 1][y - 1] = p;
        Game.board[currentX - 1][currentY - 1] = null;
        currentX = 0;
        currentY = 0;
        currentTeam = white;
      }
      else {
        currentX = 0;
        currentY = 0;
      }
    }
    else {
      currentX = 0;
      currentY = 0;
    }
  }
  
  //Paint the checkerboard and the pieces.
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //Get the width of each square
    if (this.getWidth() > this.getHeight()) {
      this.side = this.getHeight() / 8;
    }
    else {
      this.side = this.getWidth() / 8;
    }
    
    //Draw squares
    boolean isWhite = true;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (isWhite) {
          g.setColor(Color.WHITE);
          isWhite = false;
        }
        else {
          g.setColor(new Color(20, 190, 20));
          isWhite = true;
        }
        g.fillRect((i * this.side), (j * this.side), (this.side), (this.side));
      }
      
      if (i % 2 == 0) {
        isWhite = false;
      }
      else {
        isWhite = true;
      }
    }
    
    if ((currentX != 0) && (currentY != 0)) {
      g.setColor(Color.RED);
      g.fillRect((currentX - 1) * this.side, (currentY - 1) * this.side, this.side, this.side);
    }
    
    //Make sure everything is the right size
    Piece.setWidth(this.side);
    white.king.setPolygon();
    white.queen.setPolygon();
    white.rookWest.setPolygon();
    white.rookEast.setPolygon();
    white.knightWest.setPolygon();
    white.knightEast.setPolygon();
    white.bishopWest.setPolygon();
    white.bishopEast.setPolygon();
    white.pawn1.setPolygon();
    white.pawn2.setPolygon();
    white.pawn3.setPolygon();
    white.pawn4.setPolygon();
    white.pawn5.setPolygon();
    white.pawn6.setPolygon();
    white.pawn7.setPolygon();
    white.pawn8.setPolygon();
    
    black.king.setPolygon();
    black.queen.setPolygon();
    black.rookWest.setPolygon();
    black.rookEast.setPolygon();
    black.knightWest.setPolygon();
    black.knightEast.setPolygon();
    black.bishopWest.setPolygon();
    black.bishopEast.setPolygon();
    black.pawn1.setPolygon();
    black.pawn2.setPolygon();
    black.pawn3.setPolygon();
    black.pawn4.setPolygon();
    black.pawn5.setPolygon();
    black.pawn6.setPolygon();
    black.pawn7.setPolygon();
    black.pawn8.setPolygon();
    
    //Draw the pieces
    g.setColor(Color.BLACK);
    if (white.king.getStatus()) {
      g.fillPolygon(white.king.piece);
    }
    if (white.queen.getStatus()) {
      g.fillPolygon(white.queen.piece);
    }
    if (white.rookWest.getStatus()) {
      g.fillPolygon(white.rookWest.piece);
    }
    if (white.rookEast.getStatus()) {
      g.fillPolygon(white.rookEast.piece);
    }
    if (white.knightWest.getStatus()) {
      g.fillPolygon(white.knightWest.piece);
    }
    if (white.knightEast.getStatus()) {
      g.fillPolygon(white.knightEast.piece);
    }
    if (white.bishopWest.getStatus()) {
      g.fillPolygon(white.bishopWest.piece);
    }
    if (white.bishopEast.getStatus()) {
      g.fillPolygon(white.bishopEast.piece);
    }
    if (white.pawn1.getStatus()) {
      g.fillPolygon(white.pawn1.piece);
    }
    if (white.pawn2.getStatus()) {
      g.fillPolygon(white.pawn2.piece);
    }
    if (white.pawn3.getStatus()) {
      g.fillPolygon(white.pawn3.piece);
    }
    if (white.pawn4.getStatus()) {
      g.fillPolygon(white.pawn4.piece);
    }
    if (white.pawn5.getStatus()) {
      g.fillPolygon(white.pawn5.piece);
    }
    if (white.pawn6.getStatus()) {
      g.fillPolygon(white.pawn6.piece);
    }
    if (white.pawn7.getStatus()) {
      g.fillPolygon(white.pawn7.piece);
    }
    if (white.pawn8.getStatus()) {
      g.fillPolygon(white.pawn8.piece);
    }
    
    g.setColor(Color.BLUE);
    if (black.king.getStatus()) {
      g.fillPolygon(black.king.piece);
    }
    if (black.queen.getStatus()) {
      g.fillPolygon(black.queen.piece);
    }
    if (black.rookWest.getStatus()) {
      g.fillPolygon(black.rookWest.piece);
    }
    if (black.rookEast.getStatus()) {
      g.fillPolygon(black.rookEast.piece);
    }
    if (black.knightWest.getStatus()) {
      g.fillPolygon(black.knightWest.piece);
    }
    if (black.knightEast.getStatus()) {
      g.fillPolygon(black.knightEast.piece);
    }
    if (black.bishopWest.getStatus()) {
      g.fillPolygon(black.bishopWest.piece);
    }
    if (black.bishopEast.getStatus()) {
      g.fillPolygon(black.bishopEast.piece);
    }
    if (black.pawn1.getStatus()) {
      g.fillPolygon(black.pawn1.piece);
    }
    if (black.pawn2.getStatus()) {
      g.fillPolygon(black.pawn2.piece);
    }
    if (black.pawn3.getStatus()) {
      g.fillPolygon(black.pawn3.piece);
    }
    if (black.pawn4.getStatus()) {
      g.fillPolygon(black.pawn4.piece);
    }
    if (black.pawn5.getStatus()) {
      g.fillPolygon(black.pawn5.piece);
    }
    if (black.pawn6.getStatus()) {
      g.fillPolygon(black.pawn6.piece);
    }
    if (black.pawn7.getStatus()) {
      g.fillPolygon(black.pawn7.piece);
    }
    if (black.pawn8.getStatus()) {
      g.fillPolygon(black.pawn8.piece);
    }
    //There must be a better way to do that too.
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
  
  //Game.board[x - 1][y - 1]
}
