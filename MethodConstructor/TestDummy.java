public class TestDummy {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int plus1 = Dummy.plus1(a,b);
        // int plus2 = Dummy.plus2(a,b);

        Dummy dm = new Dummy();
        dm.plus1(a,b);
        dm.plus2(a,b);
    }
}
