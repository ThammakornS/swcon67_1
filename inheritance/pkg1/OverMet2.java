package pkg1;

class OverMet2 extends ForOvr {
    public static void m() { } // OK, but not ovr, it belongs to Overmet2

    // void m(int x) { } // Error, Ovr method cannot has stricter modifier (including private).
}
