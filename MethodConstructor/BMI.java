public class BMI {
    public static double calBMI(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }

    public static void main(String[] args) {
        System.out.println(BMI.calBMI(55, 172));
    }
}
