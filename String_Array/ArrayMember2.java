import java.util.Arrays;

public class ArrayMember2 {
    private int[] x;
//    public static int[] y;
//    public static final int[] z = {1,0};

    public ArrayMember2(int[] x) {
        this.x = x.clone();
    }

    public int[] getX() {
        return x;
    }

    public void setValue(int val, int pos){
        this.x[pos] = val;
    }
}

class TestArrayMember2{
    public static void main(String[] args) {
        int[] ai = new int[2];
        ArrayMember2 am2 = new ArrayMember2(ai);
        am2.setValue(1,0);
        System.out.println(Arrays.toString(ai));
        System.out.println(Arrays.toString(am2.getX()));
    }
}