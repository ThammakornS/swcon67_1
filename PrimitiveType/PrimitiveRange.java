public class PrimitiveRange {
    public static void main(String[] args) {
        // int i = 2147483648;

        int i2 = 2147483647 + 1;
        System.out.println(i2); // what value will be printed

        long l = 2147483647 + 1;
        System.out.println(l); // and this ?

        long l2 = 2147483647L + 1;
        System.out.println(l2); // and this ?

        long l3 = 100;
        // long l4 = 7890000000000;

        long l5 = 7890000000000L;

    }
}
