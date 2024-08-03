import java.util.Arrays;

public class ArrayMember3 {
    public static int[] x;
    public static final int[] y = { 0, 0 };

    public static void main(String[] args) {
        ArrayMember3.x = new int[0];
        System.out.println(Arrays.toString(x));
        ArrayMember3.y[0] = 1;
        System.out.println(Arrays.toString(y));

        // ArrayMember3.y = new int[] { 1, 1 };
        System.out.println(Arrays.toString(y));
    }
}
