import java.util.Arrays;

public class ArrRefType {
    public static void main(String[] args) {
        double[] x = { 2.5, 0.0, 8.9 };
        double[] y = x;
        y[0] = 100.0;

        System.out.println(Arrays.toString(x));

        x = new double[] { 0.0, 0.0, 0.0 };
        double y_0 = x[0];
        y_0 = 1.0;

        System.out.println(Arrays.toString(x));
    }
}
