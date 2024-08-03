public class Array2D {
    public static void main(String[] args) {
        int [][] arrInt2D = new int[3][3];
        for (int i = 0; i < arrInt2D.length ; i++) {
            for (int j = 0; j <  arrInt2D[i].length ; j++) {
                arrInt2D[i][j] = i*j;
                System.out.print(arrInt2D[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
