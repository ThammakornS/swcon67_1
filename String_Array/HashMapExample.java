import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Abby",1);
        map.put("Henry",2);
        map.put("Jonah",3);
        map.put("Linda",4);
        map.put("Perry",5);
        map.put("Perry",6);
        map.put("Perry",7); // if put duplicate key, it will replace the old value
        map.put("Susan",8);
        map.put(null,9); // allow null key, but only once

        System.out.println(map);
        System.out.println(map.get("Abby"));
        System.out.println(map.get("John"));
    }
}
