package superAcc.pkg2;

import superAcc.pkg1.ParentClass;

public class Child2 extends Child1 {
    private void trySuper(){
        System.out.println("super.x = " + super.x);
//        System.out.println("super.x = " + super.y);
//        System.out.println("super.x = " + super.z);

        System.out.println("((ParentClass)this). = " + ((ParentClass)this).x);
    }

    public static void main(String[] args) {
        Child2 c = new Child2();
        c.trySuper();
    }

}
