public class Employee {
    private int empId;
    private String empName;
    private double salary;

    // Default constructor without arguments
    public Employee() {
        empId = 0;
        empName = "Unknown";
        salary = 0.0;
    }

    // Constructor with two arguments using 'this' keyword
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        salary = 0.0;
    }

    // Constructor with three arguments
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Create three Employee objects using different constructors
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(101, "John Doe");
        Employee employee3 = new Employee(102, "Jane Smith", 50000.0);

        // Print the details of the employees
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + employee1.getEmpId());
        System.out.println("Name: " + employee1.getEmpName());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println("\nEmployee 2 Details:");
        System.out.println("ID: " + employee2.getEmpId());
        System.out.println("Name: " + employee2.getEmpName());
        System.out.println("Salary: " + employee2.getSalary());

        System.out.println("\nEmployee 3 Details:");
        System.out.println("ID: " + employee3.getEmpId());
        System.out.println("Name: " + employee3.getEmpName());
        System.out.println("Salary: " + employee3.getSalary());
    }
}
