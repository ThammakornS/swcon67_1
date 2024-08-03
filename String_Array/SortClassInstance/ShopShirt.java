package SortClassInstance;

import java.util.Arrays;

public class ShopShirt {
    public static void main(String[] args) {
        Shirt[] arrShirt = new Shirt[4];
        arrShirt[0] = new Shirt(250, "white", "M");
        arrShirt[1] = new Shirt(500, "black", "XL");
        arrShirt[2] = new Shirt(150, "pink", "S");
        arrShirt[3] = new Shirt(1300, "grey", "L");
        Arrays.sort(arrShirt);  //??
        }
}
