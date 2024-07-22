public class Person {
    private String name;
    private int age;

    Person(String name, int age) throws Exception {
        this.name = name;
        if (age < 0)
            throw new Exception("invalid age");
        this.age = age;
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person("John", -1);
    }
}
