package superAcc.pkg2;

import superAcc.pkg1.ParentClass;

public class Child1 extends ParentClass {
    public int x;
    private int z;

    public Child1(){
        x=1;
        z=1;
    }

    private void trySuper(){
        System.out.println("super.x = " + super.x);
//        System.out.println("super.y = " + super.y);
        System.out.println("super.z = " + super.z);
    }

    public static void main(String[] args) {
        new Child1().trySuper();
    }

}
