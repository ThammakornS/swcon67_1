public class SomeClass {
    public static void main(String[] args) {
        Superclass sp = new Superclass();
        Myclass m = new Myclass();
        Subclass sb = new Subclass();

        sp = m;
        m = sb;
        sp = sb;
        sp = null; 

        System.out.println(sb.i);
    }
}
