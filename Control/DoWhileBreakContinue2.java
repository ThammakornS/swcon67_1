public class DoWhileBreakContinue2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        loopA: do{
            j = 0;
            loopB: do{
                if(i==1) break loopB;
                System.out.println(i+","+j);
                j++;
            }while (j<3);
            i++;
        }while(i<3);
    }
}
