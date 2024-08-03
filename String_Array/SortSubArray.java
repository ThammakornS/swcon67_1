import java.util.Arrays;

public class SortSubArray {
public static void main(String[] args) {
    int [] ai = {7,3,1,2,1,5};
    Arrays.sort(ai, 1, 4);
    System.out.println(Arrays.toString(ai));
    // [7, 1, 2, 3, 1, 5]
    }
}
