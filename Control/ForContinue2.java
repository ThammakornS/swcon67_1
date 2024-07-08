import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForContinue2 {
    public static void main(String[] args) {
        String [] toppings = {"cheese", "tomato", "spinach", "peperoni"};
        List <String> selected_toppings = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        for(var top:toppings){
            System.out.println("Do you want to add "+top+" to your pizza (y/n)");
            String sel = in.nextLine();
            if(sel.equalsIgnoreCase("n")) continue;
            else selected_toppings.add(top);
        }

        System.out.println("Your toppings: "+selected_toppings);
    }
}
