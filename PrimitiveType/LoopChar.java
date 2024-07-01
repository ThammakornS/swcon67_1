public class LoopChar {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i); //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        }
        System.out.println();
        for (char i = '\u0041'; i <= '\u005A'; i++) {
            System.out.print(i); //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        }
        System.out.println();
        for (char i = '\u0041'; i <= 'Z'; i++) {
            System.out.print(i); //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        }
    }
}
