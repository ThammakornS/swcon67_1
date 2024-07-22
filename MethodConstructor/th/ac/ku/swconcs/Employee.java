package th.ac.ku.swconcs;

public class Employee {
    public String name;
    public int salary;
    public String position;

    public Employee() {
        this("Classified information");
    }
    public Employee(String name) {
        this(name, 25000);
    }
    public Employee(String name, int salary) {
        this(name, salary, "Classified information");
    }
    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Position: " + position);
        System.out.println();
    }
}
