// Import Employee: the interface from the company package that declares the calculateSalary() contract.
// Importing it lets the test class refer to any worker through the interface type.
import company.Employee;
// Import Manager: the class from the department package that implements the company.Employee interface.
import department.Manager;

/**
 * Demonstrates importing an interface from one package (company)
 * and using a class that implements it from another package (department).
 */
public class Q2Test {
    public static void main(String[] args) {
        // Create a Manager object but hold it inside an Employee interface reference.
        // This works because Manager implements Employee (managers ARE employees).
        Employee employee = new Manager("Harkeerat", 60000, 15000);
        // Call the calculateSalary() method through the interface reference.
        // Java runs the Manager's version at runtime (dynamic method dispatch).
        employee.calculateSalary();
    }
}