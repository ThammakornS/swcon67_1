package pkg1;

public class TargetSystem {
    public static void main(String[] args) {
        Coordinate p = new Coordinate(1, 1);
        Coordinate q = new Coordinate(2, 2);
        p.x = 3;
        p.y = 3;
        p.useCount++;
        p.origin.useCount++;
        System.out.println("(" + q.x + "," + q.y + ")");
        System.out.println(q.useCount);
        System.out.println(q.origin == Coordinate.origin);
    }
}
