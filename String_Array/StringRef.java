public class StringRef {
    public static void main(String[] args) {
        String x = "ABC";
        String y = x + "";
        System.out.println(x==y);

        String z = new String(x);
        System.out.println(x==z);

        // System.out.println(x.equals(y));
        // System.out.println(x.equals(z));
    }
}
