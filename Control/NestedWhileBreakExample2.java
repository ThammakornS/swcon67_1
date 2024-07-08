public class NestedWhileBreakExample2 {
    public static void main(String[] args) {
        int i=0, j=0;
        loopA: while(true){
            loopB: while(i<10){
                loopC: while(j<10){
                    if (i==2) break loopA;
                    System.out.println(i+","+j);
                    i++;
                    j++;
                }
            }
        }
    }
}
