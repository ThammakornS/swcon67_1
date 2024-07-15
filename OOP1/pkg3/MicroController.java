package pkg3;

public class MicroController {
    public static void main(String[] args) {
        Microchip mc = new Microchip();
        mc.CIR.eprom = 2048;
        // mc.CIR = new Circuit();
        // mc.BITS = 64;
    }
}
