import java.util.Scanner;

public class while_ex3 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         boolean flag = true;
         int sum = 0;
         
         while(flag){
            System.out.print("input an int (0 to exit): ");
            int i = in.nextInt();
            if (i==0) flag=false;
            System.out.println("current sum: " + (sum+=i));
         }
    }
}
