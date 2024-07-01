public class LocalPrimValInit6 {
    public static void f(int i){
        i = 1;
    }

    public static void main(String[] args) {
        int i = 2;
        f(i);
        System.out.println(i);
    }
}
