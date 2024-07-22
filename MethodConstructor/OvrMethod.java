public class OvrMethod {
    public void writeValue(int a, byte b) {
        System.out.println("int"+","+"byte");
    }

    public void writeValue(int a, short b) {
        System.out.println("int"+","+"short");
    }

    public void writeValue(int a, int b) {
        System.out.println("int"+","+"int");
    }

    public void writeValue(int a, double b) {
        System.out.println("int"+","+"double");
    }

    public void writeValue(double a, double b) {
        System.out.println("double"+","+"double");
    }

    public static void main(String[] args) {
        new OvrMethod().writeValue(2, 5);
        new OvrMethod().writeValue(2, 5L);
    }
}
