package pkg1;

public class Coordinate {
    int x, y, useCount;
    public static final Coordinate origin = new Coordinate(0, 0);

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
