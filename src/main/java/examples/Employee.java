package examples;

public class Employee extends Person {

    private int employeeId;
    private int salary;

    public Employee() {
        this.employeeId = 1234;
        this.salary = 3500;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public String printInfo() {
        return String.format("Employee %s with ID %d is %d years old and earns %d dollars monthly",
            this.getName(),
            this.getEmployeeId(),
            this.getAge(),
            this.getSalary()
        );
    }
}
