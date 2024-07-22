public class Employee {
    private String name;
    private int salary;
    private String position;

    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void compare(Employee em) {

        if (this.name.equalsIgnoreCase(em.name)) {
            System.out.printf("Same person: %s, Max salary: %d\n", this.name, Math.max(this.salary, em.salary));
            return;
        }
        if (this.salary == em.salary) {
            System.out.printf("%s has equal salary with %s\n", this.name, em.name);
            return;
        }
        if (this.salary > em.salary) {
            System.out.printf("%s has higher salary\n", this.name);
            return;
        }
        System.out.printf("%s has higher salary\n", em.name);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tim Jones", 35_000, "Programmer");
        Employee emp2 = new Employee("John Sandro", 100_000, "CEO");
        Employee emp3 = new Employee("Tim Jones", 250_000, "Consultant");

        emp1.compare(emp2);
        emp2.compare(emp3);
        emp1.compare(emp3);
        emp1.compare(emp1);
    }

}

