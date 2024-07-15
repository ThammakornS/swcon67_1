public class Foo {

    //    private Foo foo;
    public int x = 0;

    public Foo(int x) {
        this.x = x;
    }

    public String getFoo(Foo obj) {
        return "x = " + obj.x;
    }


    public void printFoo() {
        System.out.println(getFoo(this));
    }

    public static void main(String[] args) {


        Foo o1 = new Foo(1), o2 = new Foo(2);
        o1.printFoo();
        o2.printFoo();
    }
}