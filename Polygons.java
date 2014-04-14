import java.awt.*;

public class Polygons {
  public static Polygon setPolygon(int w, int x, int y, int type) {
    Polygon piece = new Polygon();
    
    switch (type) {
      case Piece.KING:
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
      case Piece.QUEEN:
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
      case Piece.BISHOP:
        piece.addPoint(x - (int)(w * 0.3), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.1));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.15));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.45));
        piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.45));
        piece.addPoint(x + (int)(w * 0.0), y - (int)(w * 0.25));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.40));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.2));
        piece.addPoint(x + (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5)); 
        break;
      case Piece.KNIGHT:
        piece.addPoint(x - (int)(w * 0.3), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.0));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.1));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.3));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.47));
        piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.46));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.35));
        piece.addPoint(x + (int)(w * 0.4), y - (int)(w * 0.25));
        piece.addPoint(x + (int)(w * 0.38), y - (int)(w * 0.0));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.1));
        piece.addPoint(x + (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5));
        break;
      case Piece.ROOK:
        piece.addPoint(x - (int)(w * 0.3), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.2));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.2));
        piece.addPoint(x - (int)(w * 0.3), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.3), y - (int)(w * 0.2));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.2));
        piece.addPoint(x + (int)(w * 0.25), y + (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5));
        break;
      case Piece.PAWN:
        piece.addPoint(x - (int)(w * 0.3), y + (int)(w * 0.5));
        piece.addPoint(x - (int)(w * 0.2), y - (int)(w * 0.1));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.2));
        piece.addPoint(x - (int)(w * 0.25), y - (int)(w * 0.4));
        piece.addPoint(x - (int)(w * 0.19), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.19), y - (int)(w * 0.5));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.4));
        piece.addPoint(x + (int)(w * 0.25), y - (int)(w * 0.2));
        piece.addPoint(x + (int)(w * 0.2), y - (int)(w * 0.1));
        piece.addPoint(x + (int)(w * 0.3), y + (int)(w * 0.5));
        break;
      default:
        System.out.println("Piece type of " + type + " does not exist.");
        System.exit(1);
    }
    
    return piece;
  }

  public static void setPolygon(Piece p, int w, int type) {
    p.piece = setPolygon((int)(w * 0.9), p.getX() * w - w / 2,
                         p.getY() * w - w / 2, type);
  }
}
