public class RefSwap {
    public static void swap(Ref x, Ref y){
        Ref tempt = x;
        x = y;
        y = tempt;
    }

    public static void swap2(Ref x, Ref y){
        int tempt = x.x;
        x.x = y.x;
        y.x = tempt;
    }

    public static void main(String[] args) {
        Ref a = new Ref(), b = new Ref();
        swap(a,b);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);

        swap2(a,b);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
    }
}
