import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        double[] arrDouble = {20.1, 3.2, 8.67, 9.997};
        Arrays.sort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));

        for( int i = 0; i < arrDouble.length/2; ++i ) {
            double temp = arrDouble[i];
            arrDouble[i] = arrDouble[arrDouble.length - i - 1];
            arrDouble[arrDouble.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrDouble));

        //####

        arrDouble = new double[]{20.1, 3.2, 8.67, 9.997};
        // [20.1, 9.997, 8.67, 3.2]


       Double[] arrDoubleObj = Arrays.stream(arrDouble)
               .boxed()
               .toArray(Double[]::new);
        arrDoubleObj = new Double[arrDouble.length];
        for (int i = 0; i < arrDouble.length; i++) {
            arrDoubleObj[i] = arrDouble[i];
        }

        Arrays.sort(arrDoubleObj, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrDoubleObj));
    }
}
