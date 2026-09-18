package department;

// Import Employee: the interface from the company package that Manager must implement.
// It defines the calculateSalary() contract which Manager overrides below.
import company.Employee;

/**
 * Manager class inside the department package.
 * Implements the company.Employee interface to calculate the manager's salary.
 */
public class Manager implements Employee {
    // Stores the name of the manager.
    String managerName;
    // Stores the fixed basic payroll amount of the manager.
    double basicSalary;
    // Stores the additional bonus amount given to the manager.
    double bonus;

    /**
     * Constructor: Initializes a Manager with a name, basic salary and bonus.
     * @param name  the manager's name
     * @param basic the fixed basic salary
     * @param bonus the bonus amount on top of the basic salary
     */
    public Manager(String name, double basic, double bonus) {
        // Store the passed-in name into the managerName field.
        managerName = name;
        // Store the passed-in basic salary into the basicSalary field.
        basicSalary = basic;
        // Store the passed-in bonus into the bonus field. 'this' is used
        // to tell the field apart from the method parameter of the same name.
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        // Compute the total salary by adding the basic salary and the bonus together.
        double totalSalary = basicSalary + bonus;
        // Print the manager's name as a heading.
        System.out.println("Manager: " + managerName);
        // Display the basic salary portion.
        System.out.println("Basic Salary: " + basicSalary);
        // Display the bonus portion.
        System.out.println("Bonus: " + bonus);
        // Display the final total salary.
        System.out.println("Total Salary: " + totalSalary);
    }
}