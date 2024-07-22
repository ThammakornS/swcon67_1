public class Money {
    public static void swap(Pocket a, Pocket b){
        int tempt = a.money;
        a.money=b.money;
        b.money=tempt;
    }

    public static void main(String[] args) {
        Pocket poc1 = new Pocket(1);
        Pocket poc2 = new Pocket(2);
        swap(poc1, poc2);
        System.out.println(poc1.money);
        System.out.println(poc2.money);
    }
}
