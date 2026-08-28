import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_ResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {                              // Outer try-catch
            System.out.print("Enter student name: ");
            String name = sc.next();       // may throw InputMismatchException
            try {                          // Inner try-catch
                System.out.print("Enter marks for 3 subjects: ");
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();
                double avg = (s1 + s2 + s3) / 3;
                System.out.println("Result for " + name + ": Average = " + avg);
            } catch (ArithmeticException e) {
                System.out.println("Inner: ArithmeticException while calculating average if subjects is zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner: ArrayIndexOutOfBoundsException on invalid subject index");
            }
        } catch (InputMismatchException e) {
            System.out.println("Outer: InputMismatchException if user enters text instead of marks");
        }
        sc.close();
    }
}