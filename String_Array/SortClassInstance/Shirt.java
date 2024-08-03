package SortClassInstance;

public class Shirt {
    double price;
    String color;
    String size;

    public Shirt(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "[" + price + ":" + color + ":" + size + "]";
    }
}
