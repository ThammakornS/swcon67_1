import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Shirt2 {
    double price;
    String color, size;

    public Shirt2(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[" + price + ":" + color + ":" + size +"]";
    }
}

class ShopShirt2{
    public static void main(String[] args) {
        Shirt2[] arrShirt = new Shirt2[4];
        arrShirt[0] = new Shirt2(250, "white", "M");
        arrShirt[1] = new Shirt2(500, "black", "XL");
        arrShirt[2] = new Shirt2(150, "pink", "S");
        arrShirt[3] = new Shirt2(1300, "grey", "L");



        //sort by price
        Arrays.sort(arrShirt, new Comparator<Shirt2>() {
            public int compare(Shirt2 o1, Shirt2 o2) {
                double diff = o1.price - o2.price;
                return diff>0?1:diff==0?0:-1;
            }
        });
        System.out.println(Arrays.toString(arrShirt));



        //sort by color (first alphabet)
        Arrays.sort(arrShirt, new Comparator<Shirt2>() {
            public int compare(Shirt2 o1, Shirt2 o2) {
                return o1.color.charAt(0)-o2.color.charAt(0);
            }
        });
        System.out.println(Arrays.toString(arrShirt));



        //sort by size (need specific criteria)
        Arrays.sort(arrShirt, new Comparator<Shirt2>() {
            public int compare(Shirt2 o1, Shirt2 o2) {

                HashMap<String, Integer> sizeMap = new HashMap<>();
                sizeMap.put("S",0);
                sizeMap.put("M",1);
                sizeMap.put("L",2);
                sizeMap.put("XL",3);

                return sizeMap.get(o1.size) - sizeMap.get(o2.size);
            }
        });
        System.out.println(Arrays.toString(arrShirt));
    }
}
