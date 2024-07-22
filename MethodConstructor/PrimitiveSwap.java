public class PrimitiveSwap {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
