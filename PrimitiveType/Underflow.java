public class Underflow {
    public static void main(String[] args) {

        double d = 1e-305 * Math.PI;
        System.out.println("gradual underflow:\n" + d);
        for (int i = 0; i < 4; i++)
            System.out.println(d /= 1e5); 
    }
}
