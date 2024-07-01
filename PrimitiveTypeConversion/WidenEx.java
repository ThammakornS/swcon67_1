public class WidenEx {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;
        float f = i;
        double d = f;
        System.out.println(d);
    }
}
