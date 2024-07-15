package pkg2;

public class Receiver {
    private static int revCount;
    private int pingCount;

    public void ping() {
        revCount++;
        pingCount++;
    }

    public int getRevCount() {
        return revCount;
    }

    public int getPingCount() {
        return pingCount;
    }
}
