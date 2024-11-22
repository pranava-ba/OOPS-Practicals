import java.util.Scanner;

// Employee class
class Employee {
    // Member variables
    protected String empName;
    protected int empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay; // Shared Basic Pay for all roles

    // Constructor
    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Calculate gross salary
    public double grossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClubFund;
    }

    // Display employee details and pay slip
    public void displayPaySlip() {
        System.out.println("\nEmployee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No.: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary());
    }
}

// Main class to test the implementation
 class EmployeePaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create employees of different roles
        Employee programmer = new Employee("John Doe", 1001, "123 Main St", "john@example.com", "1234567890", 50000.0);
        Employee assistantProfessor = new Employee("Jane Smith", 2001, "456 Elm St", "jane@example.com", "9876543210", 60000.0);
        Employee associateProfessor = new Employee("David Johnson", 3001, "789 Oak St", "david@example.com", "5551234567", 70000.0);
        Employee professor = new Employee("Emily Brown", 4001, "101 Pine St", "emily@example.com", "9998887777", 80000.0);

        // Display pay slips for each employee
        System.out.println("\nProgrammer Pay Slip:");
        programmer.displayPaySlip();

        System.out.println("\nAssistant Professor Pay Slip:");
        assistantProfessor.displayPaySlip();

        System.out.println("\nAssociate Professor Pay Slip:");
        associateProfessor.displayPaySlip();

        System.out.println("\nProfessor Pay Slip:");
        professor.displayPaySlip();

        // Close the scanner
        sc.close();
    }
}
