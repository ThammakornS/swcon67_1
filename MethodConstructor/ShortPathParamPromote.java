public class ShortPathParamPromote {
    public static void plus1(double a, double b) {
        System.out.println(a + b);
    }

    public static void plus1(long a, long b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        plus1(a, b);
    }
}
