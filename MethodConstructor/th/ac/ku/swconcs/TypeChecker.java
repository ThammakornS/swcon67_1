package th.ac.ku.swconcs;
public class TypeChecker {
    public int getType(int x){
        System.out.println("is int");
        return x;
    }

    double getType(double x){
        System.out.println("is double");
        return x;
    }

    protected float getType(float x){
        System.out.println("is float");
        return x;
    }

    private long getType(long x){
        System.out.println("is long");
        return x;
    }

    public Object getType(Object x){
        System.out.println("is Object");
        return x;
    }
}

class TestOvrMethod{
    public static void main(String[] args) {
        TypeChecker tc = new TypeChecker();
        tc.getType(0);
        tc.getType(0.0);
        tc.getType(1L);//!!!
        tc.getType(1f);
    }
}
