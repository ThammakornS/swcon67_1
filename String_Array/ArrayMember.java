
import java.util.Arrays;

public class ArrayMember {
    private int[] x;
//    public static int[] y;
//    public static final int[] z = {1,0};

    public ArrayMember(int[] x) {
        this.x = x;
    }

    public int[] getX() {
        return x;
    }

    public void setValue(int val, int pos){
        this.x[pos] = val;
    }
}

class TestArrayMember{
    public static void main(String[] args) {
        int[] ai = new int[2];
        ArrayMember am = new ArrayMember(ai);
        am.setValue(1,0);
        System.out.println(Arrays.toString(ai));
        System.out.println(Arrays.toString(am.getX()));
    }
}
