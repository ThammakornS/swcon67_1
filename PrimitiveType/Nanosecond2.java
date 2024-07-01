public class Nanosecond2 {
    public static long minToNanoSec(int min){
        long nanoSec = min*60*1_000_000_000L;
        return(nanoSec);
    }
    public static void main(String[] args) {
       System.out.println(minToNanoSec(0));
       System.out.println(minToNanoSec(1));
       System.out.println(minToNanoSec(10));
       System.out.println(minToNanoSec(100));
       System.out.println(minToNanoSec(1000));
       System.out.println(minToNanoSec(10000));
    }
}
