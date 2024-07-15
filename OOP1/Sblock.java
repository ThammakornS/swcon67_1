public class Sblock {
    static int i;
    static {
        System.out.println("Call static block");
        i = 1;
    }

    public Sblock(int i) {
        System.out.println("Call constructor");
        Sblock.i = i;
    }

    public static void main(String[] args) {
        System.out.println(Sblock.i);
        Sblock o = new Sblock(2);
        System.out.println(Sblock.i);
        o = new Sblock(3);
        System.out.println(Sblock.i);
    }
}
