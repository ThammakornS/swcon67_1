public class Overflow {
    public static void main(String[] args) {

        double d = 1e308;
        System.out.print("overflow produces infinity: ");
        System.out.println(d + "*10 == " + d * 10);

    }
}
