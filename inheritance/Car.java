public class Car extends Vehicle {
    private int numWheel;
    private int numDoor;
    private int numSeat;
    private double hp;

    public Car(double size, int numWheel, int numDoor, int numSeat, double hp) {
        super(size);
        this.numWheel = numWheel;
        this.numDoor = numDoor;
        this.numSeat = numSeat;
        this.hp = hp;
    }

    public void getCarInfo() {
        System.out.printf("#Wheels: %d\n" +
                        "#Doors: %d\n" +
                        "#Seats: %d\n" +
                        "Horse power: %.2f\n" +
                        "Size:%.2f ", numWheel, numDoor, numSeat, hp, getSize() );
    }
}
