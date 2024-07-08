public class ForEx2 {
    public static void main(String[] args) {
        loopA: for (int i = 0; i < 5; i++) {
            loopB: for (int j = 0; j < 5; j++) {
                if(i==1) continue loopA;
                if(j==4) break loopB; //or just break
                System.out.println(i+","+j);
            }            
        }
    }
}
