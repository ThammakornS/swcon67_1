public class NestedWhileContinue {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        loopA: while(i<10){
            System.out.println("i=" + i++);
            loopB: while(j<10){
                System.out.println("j="+j++);
                if(i==3) continue loopA;
                if(i==5) break loopB;
            }
        }
    }
}
