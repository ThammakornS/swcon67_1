public class ForOvr {
    public static void m(){ }
    public void m(int x){}
    private void m(double x){}
}

class OvrMet1 extends ForOvr{
//    public void m(){ } //Error, static method cannot be overridden
    public void m(int x){ } // Ovr
    public void m(double x){ } // OK, but not ovr
}

class Overmet2 extends ForOvr{
    public static void m(){ } //OK, but not ovr, it belongs to Overmet2
//    void m(int x){ } // Error, Ovr method cannot has weaker modifier (include private).
}

