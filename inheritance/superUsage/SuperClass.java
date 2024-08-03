package superUsage;

public class SuperClass {
    int x = 0;

    @Override
    public String toString() {
        return "SuperClass{" + "x=" + x + '}';
    }
}

class SubClass1 extends SuperClass{

    public SubClass1(int x) {
        this.x = x;
    }

    void getX(){
        System.out.println("x = "+x);
    }

    void getThisX(){
        System.out.println("this.x = "+this.x);
    }

    void getSuperX(){
        System.out.println("super.x = " + super.x);
    }


    public static void main(String[] args) {
        SubClass1 s = new SubClass1(1);
        s.getX();
        s.getThisX();
        s.getSuperX();
    }
}


class SubClass2 extends SuperClass{

    public int x = 1;

    void getX(){
        System.out.println("x = "+x);
    }

    void getThisX(){
        System.out.println("this.x = "+this.x);
    }

    void getSuperX(){
        System.out.println("super.x = " + super.x);
    }

    void getThisX2(){
        System.out.println("SubClass2.this.x = " + SubClass2.this.x);
    }

    void getSuperX2(){
        System.out.println("SubClass2.super.x = " + SubClass2.super.x);
    }

    public static void main(String[] args) {
        SubClass2 s = new SubClass2();
        s.getX();
        s.getThisX();
        s.getSuperX();
        s.getThisX2();
        s.getSuperX2();
    }
}