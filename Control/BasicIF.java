public class BasicIF {

    public static void main(String[] args) {
        int speed = 90;
        speedDetect3(speed);
    }

    public static void speedDetect1(int speed){
        if (speed >= 120) 
            System.out.println("Exceed limit speed");
    }

    public static void speedDetect2(int speed){
        if (speed >= 120) 
            System.out.println("Exceed limit speed");
        else System.out.println("Normal Speed");
    }

    public static void speedDetect3(int speed){
        if (speed >= 120) {
            System.out.println("Exceed limit speed");
            System.out.println("Please reduce speed");
        }
        else if (speed <= 20){
            System.out.println("Too slow");
            System.out.println("Please increase speed");
        }
        else System.out.println("Normal Speed");
    }
}