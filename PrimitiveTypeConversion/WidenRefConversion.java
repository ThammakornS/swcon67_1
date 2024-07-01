public class WidenRefConversion {
    public static void main(String[] args) {
        Integer iref = 1; //Box conversion
        Object o = iref;
        System.out.println(o); //1

        Float fref = 1.0f;
        o = fref;
        System.out.println(o);//1.0

        Character cref = 'a';
        o = cref;
        System.out.println(o);//a

        int i = 1;
        // o = i// Error

        iref = i; //Box conversion
        i = iref; //Unbox conversion
        System.out.println(iref);
    }
}
