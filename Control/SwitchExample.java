import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int numDay = in.nextInt();
        System.out.println("Day name: " + numToDay(numDay));

        System.out.print("Please input day name: ");
        String dayName = in.next();
        System.out.println("Day num: " + dayToNum(dayName));
    }

    public static int dayToNum(String dayName) {
        switch (dayName) {
            case ("Monday"):
                return 1;
            case ("Tuesday"):
                return 2;
            case ("Wednesday"):
                return 3;
            case ("Thursday"):
                return 4;
            case ("Friday"):
                return 5;
            case ("Saturday"):
                return 6;
            case ("Sunday"):
                return 7;
            default:
                return -1;
        }
    }

    public static String numToDay(int numDay) {
        switch (numDay) {
            case (1):
                return "Monday";
            case (2):
                return "Tuesday";
            case (3):
                return "Wednesday";
            case (4):
                return "Thursday";
            case (5):
                return "Friday";
            case (6):
                return "Saturday";
            case (7):
                return "Sunday";
            default:
                return "Invalid input";
        }
    }

public static String numToDay2(int numDay) {
    return switch (numDay) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid input";
    };
}

public static int dayToNum2(String dayName) {
    return switch (dayName) {
        case "Monday" -> 1;
        case "Tuesday" -> 2;
        case "Wednesday" -> 3;
        case "Thursday" -> 4;
        case "Friday" -> 5;
        case "Saturday" -> 6;
        case "Sunday" -> 7;
        default -> -1;
    };
}

}
