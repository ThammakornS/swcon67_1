import java.util.Scanner;

public class while_ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.print("input an int (0 to exit): ");
        int i = in.nextInt();

        while(i!=0){
            System.out.println("current sum: " + (sum+=i));
            System.out.print("input an int (0 to exit): ");
            i = in.nextInt();
        }
    }
}
