package pkg2;

public class Server {
    public static void main(String[] args) {
        Receiver r1 = new Receiver();
        Receiver r2 = new Receiver();
        r1.ping();
        r2.ping();
        r2.ping();

        System.out.println(r1.getPingCount());
        System.out.println(r2.getPingCount());

        System.out.println(r1.getRevCount());
        System.out.println(r2.getRevCount());
    }
}
