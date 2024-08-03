import java.util.Arrays;

public class ArrTest2 {
    public static void main(String[] args) {
        Point [] ap = new Point[2];
        ap[0] = new Point(0,0);
        ap[1] = new Point(1,1);
        print(ap);

        Point p = new Point(2,2);
        ap[0] = p;
        print(ap);

        ap[0].set(3,3);
        print(ap);
        System.out.println(p);
    }

    public static void print(Object[] arr){
        System.out.println(Arrays.toString(arr));
    }
}

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x+":"+y;
    }
}
