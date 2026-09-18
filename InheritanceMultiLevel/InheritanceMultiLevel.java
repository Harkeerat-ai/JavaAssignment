/**
 * Base class representing a generic employee with a name and base salary.
 */
class Employee {
    // Name of the employee.
    String name;
    // The base salary paid to the employee.
    double baseSalary;

    /**
     * Constructor: initializes the employee with a name and a base salary.
     */
    Employee(String name, double baseSalary) {
        // Store the passed-in name into the 'name' field of this object.
        this.name = name;
        // Store the passed-in base salary into the 'baseSalary' field.
        this.baseSalary = baseSalary;
    }
}

/**
 * Intermediate class extending Employee, adding a bonus component.
 */
class Manager extends Employee {
    // Additional money earned on top of the base salary.
    double bonus;

    /**
     * Constructor: initializes a Manager by forwarding the base data to the Employee
     * class (via super) and storing the bonus locally.
     */
    Manager(String name, double baseSalary, double bonus) {
        // Call the parent class constructor to set the name and base salary.
        super(name, baseSalary);
        // Store the bonus amount in this object's field.
        this.bonus = bonus;
    }
}

/**
 * Most derived class extending Manager, adding a performance incentive.
 * Demonstrates multilevel inheritance: Employee -> Manager -> SeniorManager.
 */
class SeniorManager extends Manager {
    // Extra money paid based on how well the manager performed.
    double performanceIncentive;

    /**
     * Constructor: initializes a SeniorManager by forwarding data up the inheritance
     * chain (via super) and storing the performance incentive locally.
     */
    SeniorManager(String name, double baseSalary, double bonus, double performanceIncentive) {
        // Call the immediate parent (Manager) constructor with the first three values.
        super(name, baseSalary, bonus);
        // Store the performance incentive in this object's field.
        this.performanceIncentive = performanceIncentive;
    }

    /** Calculates total salary by summing all salary components. */
    double getTotalSalary() {
        // Add the base salary, bonus and performance incentive together.
        return baseSalary + bonus + performanceIncentive;
    }
}

/**
 * Demonstrates multilevel inheritance by creating a SeniorManager
 * and displaying all salary components.
 */
public class InheritanceMultiLevel {

    /**
     * Main method: creates a SeniorManager object and prints all the
     * salary components inherited from each level of the hierarchy.
     */
    public static void main(String[] args) {
        // Create a SeniorManager with a name, base salary, bonus and performance incentive.
        SeniorManager sm = new SeniorManager("Harkeerat", 50000, 10000, 5000);

        // Print the name inherited from the Employee class.
        System.out.println("Name: " + sm.name);
        // Print the base salary inherited from the Employee class.
        System.out.println("Base Salary: " + sm.baseSalary);
        // Print the bonus inherited from the Manager class.
        System.out.println("Bonus: " + sm.bonus);
        // Print the performance incentive stored in the SeniorManager class.
        System.out.println("Performance Incentive: " + sm.performanceIncentive);
        // Print the total salary computed by summing all components.
        System.out.println("Total Salary: " + sm.getTotalSalary());
    }
}
