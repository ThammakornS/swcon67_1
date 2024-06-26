import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleColons {

    public DoubleColons(Integer a){
        System.out.println(Math.sqrt(a));
    }

    public static void main(String[] args) {
        List <Integer> x = new ArrayList<>();  
        x.add(4);
        x.add(9);
        x.add(16);  
        x.add(25);   
        x.forEach(DoubleColons::new);
    }
}