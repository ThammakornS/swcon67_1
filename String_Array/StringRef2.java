public class StringRef2 {
    public static void main(String[] args) {
        String x = "ABC";
        String y = x.concat("");
        System.out.println(x==y);
        System.out.println(x.equals(y));

        y = x.concat("D");
        System.out.println(x==y);
        System.out.println(x.equals(y));

    }
}
