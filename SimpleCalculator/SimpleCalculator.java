import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the operator(+ , - , * , /) : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("Please enter the correct operator");
                break;
        }
    }
}