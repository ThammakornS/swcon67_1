public class Operand4_1 {

    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        i += ++i;
        j = 1 + i++;
        System.out.println("i="+i+"\nj="+j);
    }
}