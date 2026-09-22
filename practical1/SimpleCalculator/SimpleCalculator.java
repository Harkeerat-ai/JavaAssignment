// Import Scanner: used to read the two numbers and the operator typed on the keyboard.
import java.util.Scanner;

/**
 * A simple console-based calculator that reads two integers and an operator
 * (+, -, *, /) from the user and performs the corresponding arithmetic operation.
 */
public class SimpleCalculator {

    /**
     * Main method: asks the user for two numbers and an operator,
     * then performs the matching arithmetic operation using a switch statement.
     */
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number.
        System.out.println("Please enter the first number : ");
        // Read the first integer typed by the user and store it in 'num1'.
        int num1 = sc.nextInt();
        // Prompt the user to enter the second number.
        System.out.println("Please enter the second number : ");
        // Read the second integer typed by the user and store it in 'num2'.
        int num2 = sc.nextInt();
        // Prompt the user to enter the arithmetic operator.
        System.out.println("Please enter the operator(+ , - , * , /) : ");
        // Read the next token and take only its first character as the operator.
        char op = sc.next().charAt(0);

        // Perform the selected operation using a switch statement
        switch (op) {
            case '+':
                // Addition: print the two numbers and their sum.
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                // Subtraction: print the two numbers and their difference.
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                // Multiplication: print the two numbers and their product.
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                // Division: print the two numbers and their quotient.
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                // The user typed something that is not +, -, * or /, so show an error message.
                System.out.println("Please enter the correct operator");
                break;
        }
    }
}
