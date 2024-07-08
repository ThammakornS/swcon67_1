public class ConOpr {
    public static void main(String[] args) {
        System.out.println(getGradeSU("John", 70));
    }

    public static String getGradeSU(String name, int score) {
        return score >= 50 ? name + " grade S" : name + " grade U";
    }

}
