import java.util.Scanner;

/**
 * A simple console-based calculator that reads two integers and an operator
 * (+, -, *, /) from the user and performs the corresponding arithmetic operation.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the operator(+ , - , * , /) : ");
        char op = sc.next().charAt(0);

        // Perform the selected operation using a switch statement
        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Please enter the correct operator");
                break;
        }
    }
}
