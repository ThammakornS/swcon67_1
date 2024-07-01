public class InexactFloat {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.print(" " + i);
        }
        System.out.println();
        // System.out.println( 41 * (1.0f / 41));    
    }
}
