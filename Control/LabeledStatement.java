public class LabeledStatement {
    public static void main(String[] args) {


        makeTarget:
        while (true){
            int target = (int) (Math.random() * 100);

            makeRand:
            for (int i = 0; i < 100; i++) {
                int randNum = (int) (Math.random() * 100);
                if (randNum == target) {
                    System.out.println("Found "+target+" at loop "+i);
                    continue makeTarget;
                }
            }
            System.out.println("Out of luck");
            break makeTarget;
        }
    }
}
