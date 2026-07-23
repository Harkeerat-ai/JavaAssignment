/**
 * Base class representing a generic employee with a name and base salary.
 */
class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

/**
 * Intermediate class extending Employee, adding a bonus component.
 */
class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
}

/**
 * Most derived class extending Manager, adding a performance incentive.
 * Demonstrates multilevel inheritance: Employee -> Manager -> SeniorManager.
 */
class SeniorManager extends Manager {
    double performanceIncentive;

    SeniorManager(String name, double baseSalary, double bonus, double performanceIncentive) {
        super(name, baseSalary, bonus);
        this.performanceIncentive = performanceIncentive;
    }

    /** Calculates total salary by summing all salary components. */
    double getTotalSalary() {
        return baseSalary + bonus + performanceIncentive;
    }
}

/**
 * Demonstrates multilevel inheritance by creating a SeniorManager
 * and displaying all salary components.
 */
public class InheritanceMultiLevel {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Harkeerat", 50000, 10000, 5000);

        System.out.println("Name: " + sm.name);
        System.out.println("Base Salary: " + sm.baseSalary);
        System.out.println("Bonus: " + sm.bonus);
        System.out.println("Performance Incentive: " + sm.performanceIncentive);
        System.out.println("Total Salary: " + sm.getTotalSalary());
    }
}
