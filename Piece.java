import java.awt.*;

public abstract class Piece {
  public Polygon piece = new Polygon();
  private int x;
  private int y;
  private static int width;
  private boolean status;
  private int team;
  public static final int KING = 1;
  public static final int QUEEN = 2;
  public static final int BISHOP = 3;
  public static final int KNIGHT = 4;
  public static final int ROOK = 5;
  public static final int PAWN = 6;
  private int type;
  
  public final static int WHITE = 0;
  public final static int BLACK = 1;
  
  public Piece() {
    this.x = 1;
    this.y = 1;
    setWidth(30);
    this.status = true;
    this.team = WHITE;
  }
  
  public Piece(int x, int y, int width) {
    this.setX(x);
    this.setY(y);
    setWidth(width);
    this.status = true;
    this.team = WHITE;
  }
  
  public Piece(int x, int y, int width, int team) {
    this.setX(x);
    this.setY(y);
    setWidth(width);
    this.status = true;
    this.team = team;
  }

  public static void setWidth(int w) {
    width = w;
  }

  public static int getWidth() {
    return width;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }
  
  public void setStatus(boolean x) {
    this.status = x;
  }
  
  public boolean getStatus() {
    return this.status;
  }
  
  public int getTeam() {
    return this.team;
  }
  
  public int getType() {
    return this.type;
  }
  
  public void setType(int t) {
    this.type = t;
  }
  
  public abstract boolean getValidSquares(int oldX, int oldY, int newX,
      int newY, Team team, Piece[][] board);
  
  public abstract boolean getAttackSquares(int oldX, int oldY, int newX,
      int newY, Team team, Piece[][] board);
}