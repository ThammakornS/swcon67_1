package pkg1;

public class Parent {
    public int insv_pub;
    private int insv_pri;
    public static int classv_pub;
}


class Child extends Parent{

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.insv_pub);
//        System.out.println(c.insv_pri);

        Child.classv_pub = 1;
        System.out.println("c.classv_pub = " + c.classv_pub);
        System.out.println("Parent.classv_pub = " + Parent.classv_pub);

        Parent.classv_pub = 9;
        System.out.println("c.classv_pub = " + Child.classv_pub);
        System.out.println("Parent.classv_pub = " + Parent.classv_pub);
        
    }
}