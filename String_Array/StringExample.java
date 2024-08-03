public class StringExample {
    public static void main(String[] args) {
        String x = "ABC";
        String y = "ABC";
        System.out.println(x==y);

        y = "XYZ";
        System.out.println(x==y);
        // System.out.println(x);
        // System.out.println(y);

        y = new String("ABC");
        // y = "ABC";
        System.out.println(x == y);
        // System.out.println(x.equals(y));

        y = "abc";
        // System.out.println(x.equals(y));
    }
}
