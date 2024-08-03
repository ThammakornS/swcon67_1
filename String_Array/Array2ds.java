public class Array2ds {
    public static void main(String[] args) {
        String [][] arr2D_2 = new String[10][];

        for (int i = 0; i < arr2D_2.length; i++) {
            arr2D_2[i] = new String[10-i];
            for (int j = 0; j < arr2D_2[i].length; j++) {
                arr2D_2[i][j] = ""+i+j;
            }
        }

        for (int i = 0; i < arr2D_2.length; i++) {
            for (int j = 0; j < arr2D_2[i].length; j++) {
                System.out.print(arr2D_2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
