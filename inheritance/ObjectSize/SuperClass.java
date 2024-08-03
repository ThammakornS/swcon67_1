package ObjectSize;

public class SuperClass {
    // public int x = 1;
    private int x = 0;

    public int getX(){
        return x;
    }
}

class SubClass extends SuperClass { 
    public int x = 1;

    public int getX(){
        return x;
    }
}

class SubObjSize{
    public static void main(String[] args) {
        SubClass s = new SubClass();
//        System.out.println(pkg1.ObjSizeEstimator.getObjectSize(s));

        System.out.println(s.getX());
    }
}



