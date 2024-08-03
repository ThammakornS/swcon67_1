import java.util.Arrays;

public class Shirt implements Comparable{
    double price;
    String color, size;

    public Shirt(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[" + price + ":" + color + ":" + size +"]";
    }

    @Override
    public int compareTo(Object o) {
        Shirt s = (Shirt) o;
        double diff = this.price - s.price;
//        return (int)diff;
        return diff > 0? 1:
                diff == 0? 0:-1;
    }
}

class ShopShirt{
    public static void main(String[] args) {
        Shirt[] arrShirt = new Shirt[4];
        arrShirt[0] = new Shirt(250, "white", "M");
        arrShirt[1] = new Shirt(500, "black", "XL");
        arrShirt[2] = new Shirt(150, "pink", "S");
        arrShirt[3] = new Shirt(1300, "grey", "L");

//        System.out.println(arrShirt[0].compareTo(arrShirt[1]));

        Arrays.sort(arrShirt);
        System.out.println(Arrays.toString(arrShirt));
    }
}

