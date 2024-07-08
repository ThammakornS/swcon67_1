public class DoWhileBreakContinue {
    public static void main(String[] args) {
        int i =0;
        do{
            i++;
            if(i==3) continue;
            if(i==7) break;
            System.out.println(i);
        }while(i<10);
    }
}
