public class While_ex {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i);
            i++;
        }
        System.out.println();
        int j = 0;
        while (true) {
            if(j >= 10) break;
            System.out.print(j);
            j++;
       }
    }
}
