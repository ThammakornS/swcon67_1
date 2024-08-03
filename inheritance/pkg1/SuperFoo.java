package pkg1;

public class SuperFoo {
    private int x;

    public void incrX(){
        x++;
    }

    private void decrX(){
        x--;
    }

    public void reducX(){
        decrX();
    }

    public int getX() {
        return x;
    }

    public static void getStat( ){
        System.out.println("SuperFoo");
    }
}

class SubFoo extends SuperFoo{

    public static void getStat( ){
        System.out.println("SupFoo");
    }


    public static void main(String[] args) {
        SubFoo s = new SubFoo();

        s.incrX();
        System.out.println("x = " + s.getX());

//        s.decrX();

        s.reducX();
        System.out.println("x = " + s.getX());


        SubFoo.getStat();
        SuperFoo.getStat();
    }

}
