// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Checks whether a given year is a leap year based on the standard rule:
 * divisible by 400, or divisible by 4 but not by 100.
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Ask the user to type the year they want to check.
        System.out.println("Please enter the year to be checked : ");
        // Read the year typed by the user as an integer.
        int year = sc.nextInt();

        // Leap year if divisible by 400, or divisible by 4 but not 100
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a leap year!");
        // Otherwise (does not satisfy either rule) it is not a leap year.
        else
            System.out.println(year + " is not a leap year!");
    }
}