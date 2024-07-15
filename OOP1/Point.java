public class Point {
    public static int numPoints; // numPoints is a class variable
    public int x, y; // x and y are instance variables
    public int[] w = new int[10]; // w[0] is an array component

    public int setX(int x) { // x is a method parameter
        int oldx = this.x; // oldx is a local variable
        this.x = oldx;
        this.x = x;
        return oldx;
    }
}
