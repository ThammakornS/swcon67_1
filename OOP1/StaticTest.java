public class StaticTest {
    public static void main(String[] args) {
        System.out.println(MyMath.PI);
        // System.out.println(Rectangle.getWidth());

        Rectangle r = new Rectangle(3, 3);
        System.out.println(r.getWidth());

        System.out.println(MyMath.square(2));
        // System.out.println(Rectangle.getArea());

        r = new Rectangle(3, 3);
        System.out.println(r.getArea());
    }
}
