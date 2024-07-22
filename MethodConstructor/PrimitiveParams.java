public class PrimitiveParams {

    public static void change (int x){
        x = x + 1;
    }
    public static void main(String[] args) {
        int a = 0;
        change(a);
        System.out.println("a = " + a);
    }
}
