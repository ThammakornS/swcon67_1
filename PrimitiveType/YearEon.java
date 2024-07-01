public class YearEon {
    public static double yearToEon (int year){
        return year/1000000000L;
    }
    public static void main(String[] args) {
        System.out.println(yearToEon(1000));
        System.out.println(yearToEon(100));
        System.out.println(yearToEon(1));
    }
}
