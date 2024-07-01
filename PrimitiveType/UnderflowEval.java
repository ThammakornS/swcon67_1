public class UnderflowEval {
    public static void main(String[] args) {
        double d = 8e-307;
        System.out.println(1e-20 * d * 1e+20);
        System.out.println(1e-20 * (d * 1e+20));
    }
}
