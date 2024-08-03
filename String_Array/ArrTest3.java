import java.util.Arrays;

public class ArrTest3 {
    public static void main(String[] args) {
        Point p = new Point(1,1);
        Point [] ap = {p};
        print(ap);

        p.set(0,0);
        print(ap);

        ap = new Point []{new Point(2,2)};
        print(ap);
        System.out.println(p);

    }

    static void print(Object[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
