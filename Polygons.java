import java.awt.*;

public class Polygons {
  public static final int KING = 1;
  public static final int QUEEN = 2;
  public static final int BISHOP = 3;
  public static final int KNIGHT = 4;
  public static final int ROOK = 5;
  public static final int PAWN = 6;
  
  public static Polygon setPolygon(int w, int x, int y, int type) {
    Polygon piece = new Polygon();
    
    switch (type) {
      case KING:
        piece.addPoint(x + (int)(w * 0.5), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.5), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.5), y + (int)(w * 0.45));
        piece.addPoint(x - (int)(w * 0.2), y + (int)(w * 0.45));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.3));
        piece.addPoint(x - (int)(w * 0.05), y - (int)(w * 0.3));
        piece.addPoint(x - (int)(w * 0.05), y - (int)(w * 0.35));
        piece.addPoint(x - (int)(w * 0.1), y - (int)(w * 0.35));
        piece.addPoint(x - (int)(w * 0.1), y - (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.05), y - (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.05), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.05), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.05), y - (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.1), y - (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.1), y - (int)(w * 0.35));
        piece.addPoint(x + (int)(w * 0.05), y - (int)(w * 0.35));
        piece.addPoint(x + (int)(w * 0.05), y - (int)(w * 0.3));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.3));
        piece.addPoint(x + (int)(w * 0.2), y + (int)(w * 0.45));
        piece.addPoint(x + (int)(w * 0.5), y + (int)(w * 0.45));
        break;
      case QUEEN:
        piece.addPoint(x + (int)(w * 0.4), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.4), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.4), y + (int)(w * 0.45));
        piece.addPoint(x - (int)(w * 0.2), y + (int)(w * 0.45));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.0));
        piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.05));
        piece.addPoint(x - (int)(w * 0.4), y - (int)(w * 0.35));
        piece.addPoint(x - (int)(w * 0.06), y - (int)(w * 0.35));
        piece.addPoint(x - (int)(w * 0.05), y - (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.05), y - (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.06), y - (int)(w * 0.35));
        piece.addPoint(x + (int)(w * 0.4), y - (int)(w * 0.35));
        piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.05));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.0));
        piece.addPoint(x + (int)(w * 0.2), y + (int)(w * 0.45));
        piece.addPoint(x + (int)(w * 0.4), y + (int)(w * 0.45));
        break;
      case BISHOP:
        break;
      case KNIGHT:
        break;
      case ROOK:
        break;
      case PAWN:
        break;
      default:
        System.out.println("Piece type of " + type + " does not exist.");
        System.exit(1);
    }
    
    return piece;
  }
}
