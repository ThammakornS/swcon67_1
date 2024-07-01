public class ValueOfClass {
    public static void main(String[] args) {
        Circle c1 = null;
        Shape s;
        Object o;
        String str = null;

        Circle c2;
        o = c2 = c1;
        o = str;
        s = c2;
        // c1 = o;
        o = s;
        // c2 = s;

        c1 = new Circle(); 
        System.out.println(c1.isTransparent);
        System.out.println(c1.DEFAULT_SCALE);
        System.out.println(c1.currentColor);
    }
}
