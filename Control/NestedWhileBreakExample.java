public class NestedWhileBreakExample {
    public static void main(String[] args) {
        outerLoop: while (true) {
            int i = 0;
            while (i < 5) {
                System.out.println("Inner loop: " + i);
                if (i == 3) {
                    break outerLoop; // Exit both loops when i is 3
                    // break;
                }
                i++;
            }
        }
    }
}
