import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileContinue2 {
    public static void main(String[] args) {
        String [] toppings = {"cheese", "tomato", "spinach", "peperoni"};
        List <String> selected_toppings = new ArrayList<>();
        int i = 0;

        Scanner in = new Scanner(System.in);
        while(i<toppings.length){
            System.out.println("Do you want to add "+toppings[i]+" to your pizza (y/n)");
            String sel = in.nextLine();
            if(sel.equalsIgnoreCase("n")){
                i++;
                continue;
            }
            else {
                selected_toppings.add(toppings[i]);
                i++;
            }
        }

        System.out.println("Your toppings: "+selected_toppings);
    }
}
