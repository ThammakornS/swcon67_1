import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, sum = 0;
        do{
            System.out.print("input an int (0 to exit): ");
            i = in.nextInt();
            System.out.println("current sum: " + (sum+=i));
        }while(i != 0);
    }
}
