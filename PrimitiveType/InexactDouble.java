public class InexactDouble {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0)
                System.out.print(" " + i);
        }         
        System.out.println();    
        // System.out.println(49*(1.0/49));  
    }

}
