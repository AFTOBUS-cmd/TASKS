package task3;

public class Program {
    public static final Line L1 = new Line(-1, 6, 5.0 / 2);
    public static final HorizontalParabola P1 = new HorizontalParabola(2, 2, 1);
    public static SimpleColor getColor(double x, double y) {
        if (P1.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (y < -2 && L1.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }
        if (y < -2 && !L1.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.GRAY;
    }

}
public static void printColorForPoint(double x, double y) {
    
}