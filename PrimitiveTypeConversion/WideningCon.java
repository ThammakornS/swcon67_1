public class WideningCon {
    public static void main(String[] args) {
        int big = 1_234_567_890;
        float approx = big;
        // double approx = big;
        System.out.println("big = " + big);
        System.out.println("approx = " + approx);
        System.out.println(big-approx);


        System.out.println(1_234_567_890-(int)approx);

    }
}
