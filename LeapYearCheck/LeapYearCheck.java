import java.util.Scanner;

/**
 * Checks whether a given year is a leap year based on the standard rule:
 * divisible by 400, or divisible by 4 but not by 100.
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year to be checked : ");
        int year = sc.nextInt();

        // Leap year if divisible by 400, or divisible by 4 but not 100
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year!");
    }
}
