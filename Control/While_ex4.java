import java.util.Scanner;

public class While_ex4 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int sum = 0;
         
         while(true){
            System.out.print("input an int (0 to exit): ");
            int i = in.nextInt();
            if (i==0) break;
            System.out.println("current sum: " + (sum+=i));
         }
    }
}
