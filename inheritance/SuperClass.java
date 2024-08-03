public class SuperClass {
    public int x = 0;
    public static int y = 0;


    public int m(int x){
        System.out.println("m() of SuperClass");
        return x;
    }

    public static int t(int x){
        System.out.println("static t() of SuperClass");
        return x;
    }
}


class SubClass extends SuperClass{
    public double m(){
        System.out.println("m() of SubClass");
        return 1;
    }

    public int m(int x){
        System.out.println("m() of SubClass");
        return x+1;
    }

    public int p(){
        return super.m(1);
    }

    public static int t(){
        return 2;
    }

    public void setX (int x){
        this.x = x;
    }

    public void setY (int y){
        SubClass.y = y;
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();

        System.out.println("sub.x = " + sub.x);
        System.out.println("SubClass.y = " + SubClass.y);

        sub.setX(5);
        System.out.println("After set sub.x = " + sub.x);
        SubClass.y = 5;
        System.out.println("After set SubClass.y = " + SubClass.y);
        System.out.println("After set SuperClass.y = " + SuperClass.y);


        System.out.println(sub.m(1));
        System.out.println(sub.m());
        System.out.println(sub.p());

        System.out.println(SubClass.t(1));
        System.out.println(sub.t(1));
    }
}