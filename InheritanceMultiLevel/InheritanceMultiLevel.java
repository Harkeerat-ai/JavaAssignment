class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
}

class SeniorManager extends Manager {
    double performanceIncentive;

    SeniorManager(String name, double baseSalary, double bonus, double performanceIncentive) {
        super(name, baseSalary, bonus);
        this.performanceIncentive = performanceIncentive;
    }

    double getTotalSalary() {
        return baseSalary + bonus + performanceIncentive;
    }
}

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