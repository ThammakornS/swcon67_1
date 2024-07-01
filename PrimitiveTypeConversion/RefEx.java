public class RefEx {
    public static void main(String[] args) {
        String s1 = "ABC";
        Object o1 = s1;
        System.out.println(s1==o1);

        Object o2 = new Rectangle(0,0);
        o2 = o1; //error?

        Rectangle r1 = new Rectangle(0, 0);
        // r1 = o2; //error?

        o1 = o2 = null;
    }
}
