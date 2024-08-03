public class Bus {
    public int numWheel=6;
    int numSeat=50;
    protected String color = "Yellow";

    public Bus(){
        color="red";
    }
}

class MiniBus extends Bus{
    public MiniBus(){
        numWheel = super.numWheel - 2;
//        numWheel = numWheel - 2;
        numSeat = super.numSeat/2;
//        numSeat = numSeat/2;
        color = "white";
    }
}

class PublicTransport {
    public static void main(String[] args) {
        MiniBus mbus = new MiniBus();
        System.out.println(mbus.numWheel);
        System.out.println(mbus.numSeat);
        System.out.println(mbus.color);
    }
}
