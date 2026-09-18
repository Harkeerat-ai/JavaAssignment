package company;

/**
 * Employee interface inside the company package.
 * Declares the contract to calculate an employee's salary.
 * Any class that represents an employee (e.g. Manager) must
 * implement this method.
 */
public interface Employee {
    /**
     * Calculates and displays the total salary of the employee.
     * The concrete employee class decides how the salary is computed.
     */
    void calculateSalary();
}