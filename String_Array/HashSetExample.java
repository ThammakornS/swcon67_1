import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> nameSet1 = new HashSet<>();

        // add(): add element into hashSet (unordered)
        nameSet1.add("Abby");
        nameSet1.add("Henry");
        nameSet1.add("Jonah");
        nameSet1.add("Linda");
        nameSet1.add("Perry"); // duplicate elements
        nameSet1.add("Perry");
        nameSet1.add("Perry");
        nameSet1.add("Susan");
        nameSet1.add(null); // Allows null

        System.out.println(nameSet1); // [null, Perry, Jonah, Susan, Abby, Henry, Linda]

        // contains(): Return true if set contains the specified element
        System.out.println(nameSet1.contains("Jonah")); // true
        System.out.println(nameSet1.contains("Kim")); // false
        System.out.println(nameSet1.contains(null)); // true

        // remove(): Remove specific element from hashSet
        nameSet1.remove("Henry");
        System.out.println(nameSet1); // [null, Perry, Jonah, Susan, Abby, Linda]
    }
}
