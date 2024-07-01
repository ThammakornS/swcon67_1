public class Nanosecond {

    public static int minToNanoSec(int min){
        int nanoSec = min*60*1_000_000_000;
        return nanoSec;
    }
    public static void main(String[] args) {
       System.out.println(minToNanoSec(0));
       System.out.println(minToNanoSec(1));
       System.out.println(minToNanoSec(10));
    }
}
