package pkg1;

public class OvrMet1 extends ForOvr {
    // public void m() { } // Error, static method cannot be overridden

    public static void m() { } // OK, class method of OvrMet1

    public void m(int x) { } // Ovr

    public void m(double x) { } // OK, but not ovr
}
