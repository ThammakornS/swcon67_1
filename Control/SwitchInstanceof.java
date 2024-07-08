public class SwitchInstanceof {
    public static void main(String[] args) {
        Object obj = "String";
        // obj = 1;
        // obj = 1.0;
        // obj = null;

        String result;
        switch (obj) {
            case Integer i:
                result = "Integer with value: " + i;
                break;
            case Double d:
                result = "Double with value: " + d;
                break;
            case String s:
                result = "String with value: " + s;
                break;
            case null:
                result = "The object is null";
                break;
            default:
                result = "Unknown type";
                break;
        }

        // String result = switch (obj) {
        //     case Integer i -> "Integer with value: " + i;
        //     case Double d -> "Double with value: " + d;
        //     case String s -> "String with value: " + s;
        //     case null -> "The object is null";
        //     default -> "Unknown type";
        // };

        System.out.println(result);
    }
}
