public class SwitchControl {
    public static void main(String[] args) {
        // Integer x = 4;
        Integer x = null;
        // Integer x = 2;
        final int y = 2;

        switch (x) {
            case (0):
                System.out.println("zero");
                break;
            case (1):
                System.out.println("one");
                break;
            case (y):
                System.out.println("two");
                break;
            case (null):
                System.out.println("null");
                break;
            default:
                System.out.println("Other");
        }
    }
}
