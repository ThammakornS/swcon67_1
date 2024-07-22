package th.ac.ku.swconcs;

public class HighTableCompany {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.printData();

        Employee emp2 = new Employee("John Wick", 14000000, "ex-CEO");
        emp2.printData();

        Employee emp3 = new Employee(" Tracker Nobody", 500000);
        emp3.printData();

        Employee emp4 = new Employee("Caine Blindman");
        emp4.printData();

    }
}
