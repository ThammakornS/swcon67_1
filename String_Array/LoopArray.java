public class LoopArray {
    public static void main(String[] args) {
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i * i;
        }

        // Using index
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        // Using enhanced for-loops (for-each Loop )
        for (int n : arrInt) {
            System.out.println(n);
        }
    }
}
