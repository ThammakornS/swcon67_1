public class SwitchInstanceof2 {
    public static void main(String[] args) {
        Object obj;
        obj = new MyClass1();
        // obj = new MyClass2();

        String result;
        switch (obj) {
            case MyClass1 m1:
                result = "This is " + m1;
                break;
            case MyClass2 m2:
                result = "This is " + m2;
                break;
            case null:
                result = "The object is null";
                break;
            default:
                result = "Unknown type";
                break;
        }

        System.out.println(result);
    }
}