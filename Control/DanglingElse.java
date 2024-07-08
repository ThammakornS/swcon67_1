public class DanglingElse {
    public static void main(String[] args) {
        Door door = new Door();
        Resident resident = new Resident();
        if(door.isOpen())
            if(resident.isVisible()){
                resident.greet("Hello");
            }
        else door.bell.ring(); // A "dangling else" 
    }
}
