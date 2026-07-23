import java.util.Scanner;

/**
 * Reads a number as a string from the user and prints each digit
 * as its corresponding English word (e.g., "123" becomes "One Two Three").
 */
public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        // Iterate through each character and convert to word form
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            switch (digit) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid ");
            }
        }
    }
}
