package pkg2;

public class Home {
    public static void main(String[] args) {

        System.out.println(Garden.area);
        // System.out.println(Garden.numTree);

        Garden gd = new Garden();
        System.out.println(gd.area);
        System.out.println(gd.numTree);

        gd.area += 100;

        System.out.println(gd.area);
        System.out.println(Garden.area);
    }
}
