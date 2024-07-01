public class NarrRefConv {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0);
        Object o1 = r1;
        Rectangle r2 = (Rectangle) o1; //Narrowing conversion

        Object o2 = new Object();
        Rectangle r3 = (Rectangle) o2; //Narrowing conversion, run time error
    }
}
