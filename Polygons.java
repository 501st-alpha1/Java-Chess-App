import java.awt.*;

public class Polygons {
  public static Polygon setPolygon(int w, int x, int y, int type) {
    Polygon piece = new Polygon();
    
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
    
    return piece;
  }
}
