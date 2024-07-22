package th.ac.ku.swconcs;

public class OvrMethodTPromote {
    public int plus(int x, int y){
        System.out.println("1");
        return x+y;
    }

    private double plus(double x, long y){
        System.out.println("2");
        return x+y;
    }

    double plus(double x, float y){
        System.out.println("3");
        return x+y;
    }
}

class TestOvrMethodTPromote{
    public static void main(String[] args) {
        OvrMethodTPromote o =  new OvrMethodTPromote();
        o.plus(1.0f,1L);
    }
}
