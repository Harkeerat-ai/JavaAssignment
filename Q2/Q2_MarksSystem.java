import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_MarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks for 3 subjects: ");
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int[] marks = {s1, s2, s3};
            System.out.println("Accessing marks[5] = " + marks[5]);  // will throw ArrayIndexOutOfBoundsException
            int subj = 3;
            double avg = (s1 + s2 + s3) / (subj > 0 ? subj : 1);
            System.out.println("Average: " + avg);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: user enters text instead of marks");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: cannot calculate average when subjects is zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: invalid index on marks array");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: marks entered as string and converted incorrectly");
        }
        sc.close();
    }
}