// Import Scanner: used to read text and numbers typed on the keyboard by the user.
import java.util.Scanner;

/**
 * Employee interface declaring the common operations for all employees.
 * Any class representing a worker (Manager, Developer, etc.) must
 * implement these two methods.
 */
interface Employee {
    /**
     * Calculates the total salary of the employee.
     */
    void calculateSalary();

    /**
     * Displays the personal and payroll details of the employee.
     */
    void displayDetails();
}

/**
 * Manager class implementing the Employee interface.
 */
class Manager implements Employee {
    // Stores the name of the manager.
    String name;
    // Stores the fixed basic salary of the manager.
    double basicSalary;
    // Stores the bonus amount on top of the basic salary.
    double bonus;

    /**
     * Constructor: Initializes a Manager with a name, basic salary and bonus.
     * @param name         the manager's name
     * @param basicSalary  the fixed basic salary
     * @param bonus        the bonus amount
     */
    Manager(String name, double basicSalary, double bonus) {
        // Store the passed-in name into the manager's field.
        this.name = name;
        // Store the passed-in basic salary into the manager's field.
        this.basicSalary = basicSalary;
        // Store the passed-in bonus into the manager's field. 'this' tells the
        // field apart from the parameter with the same name.
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        // Print the total salary, which is basic salary plus bonus.
        System.out.println("Salary: " + (basicSalary + bonus));
    }

    @Override
    public void displayDetails() {
        // Print the job designation first as a heading.
        System.out.println("Designation: Manager");
        // Print the manager's name.
        System.out.println("Name: " + name);
        // Print the manager's basic salary.
        System.out.println("Basic Salary: " + basicSalary);
        // Print the manager's bonus.
        System.out.println("Bonus: " + bonus);
    }
}

/**
 * Developer class implementing the Employee interface.
 */
class Developer implements Employee {
    // Stores the name of the developer.
    String name;
    // Stores the fixed basic salary of the developer.
    double basicSalary;
    // Stores the number of projects the developer has completed.
    int projects;

    /**
     * Constructor: Initializes a Developer with a name, basic salary and project count.
     * @param name         the developer's name
     * @param basicSalary  the fixed basic salary
     * @param projects     the number of projects completed
     */
    Developer(String name, double basicSalary, int projects) {
        // Store the passed-in name into the developer's field.
        this.name = name;
        // Store the passed-in basic salary into the developer's field.
        this.basicSalary = basicSalary;
        // Store the passed-in project count into the developer's field.
        this.projects = projects;
    }

    @Override
    public void calculateSalary() {
        // Each completed project adds a fixed 5000 bonus amount.
        double projectBonus = projects * 5000;
        // Print the total salary, which is basic salary plus the project bonus.
        System.out.println("Salary: " + (basicSalary + projectBonus));
    }

    @Override
    public void displayDetails() {
        // Print the job designation first as a heading.
        System.out.println("Designation: Developer");
        // Print the developer's name.
        System.out.println("Name: " + name);
        // Print the developer's basic salary.
        System.out.println("Basic Salary: " + basicSalary);
        // Print the number of projects the developer has completed.
        System.out.println("Projects Completed: " + projects);
    }
}

/**
 * Accepts employee details and salary from the user and displays
 * the details and salary for each type of employee.
 */
public class Q3_ManagerDeveloper {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Print a heading to show we are entering the manager section.
        System.out.println("--- Enter Manager Details ---");
        // Prompt the user for the manager name.
        System.out.print("Name: ");
        // Read the whole name line and store it in mName.
        String mName = sc.nextLine();
        // Prompt the user for the basic salary.
        System.out.print("Basic Salary: ");
        // Read the decimal basic salary and store it in mBasic.
        double mBasic = sc.nextDouble();
        // Prompt the user for the bonus.
        System.out.print("Bonus: ");
        // Read the decimal bonus and store it in mBonus.
        double mBonus = sc.nextDouble();
        // Build a Manager object from the entered values.
        Manager manager = new Manager(mName, mBasic, mBonus);

        // Consume the leftover newline so the next nextLine() is not skipped.
        sc.nextLine();
        // Print a heading to show we are entering the developer section.
        System.out.println("\n--- Enter Developer Details ---");
        // Prompt the user for the developer name.
        System.out.print("Name: ");
        // Read the whole name line and store it in dName.
        String dName = sc.nextLine();
        // Prompt the user for the basic salary.
        System.out.print("Basic Salary: ");
        // Read the decimal basic salary and store it in dBasic.
        double dBasic = sc.nextDouble();
        // Prompt the user for the number of projects.
        System.out.print("Number of Projects: ");
        // Read the integer project count and store it in projects.
        int projects = sc.nextInt();
        // Build a Developer object from the entered values.
        Developer developer = new Developer(dName, dBasic, projects);

        // Print a heading for the manager's output.
        System.out.println("\n--- Manager ---");
        // Show the manager's personal and payroll details.
        manager.displayDetails();
        // Show the manager's total salary.
        manager.calculateSalary();

        // Print a heading for the developer's output.
        System.out.println("\n--- Developer ---");
        // Show the developer's personal and payroll details.
        developer.displayDetails();
        // Show the developer's total salary.
        developer.calculateSalary();
    }
}