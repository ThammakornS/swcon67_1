public class BoxingConv {
    public static void main(String[] args) {
        int i = 1;
        Integer iref = i; //boxing conversion
        System.out.println("i = " + i);
        System.out.println("iref = " + iref);
        System.out.println("iref class name = " + iref.getClass().getSimpleName());

        int i2 = iref; //unboxing conversion
        System.out.println("i2 = " + i2);
    }
}
