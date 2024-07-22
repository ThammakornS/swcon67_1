public class ReferenceParams {

    public static void change(Ref r){
        r.x++;
    }

    public static void main(String[] args) {
        Ref r1 = new Ref();
        System.out.println("Before r1.x = " + r1.x);
        change(r1);
        System.out.println("After r1.x = " + r1.x);
    }
}
