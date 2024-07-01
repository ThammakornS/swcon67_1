import java.util.ArrayList;

public class WrapperWithArrList {
    public static void main(String[] args) {
        // ArrayList <int> arrL = new ArrayList<>(); //Error
        ArrayList <Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);

        System.out.println("arrL = " + arrL);
    }
}
