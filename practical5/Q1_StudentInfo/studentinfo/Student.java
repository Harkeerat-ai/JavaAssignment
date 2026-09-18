package studentinfo;

// Import Scanner: used to read text and numbers typed on the keyboard by the user.
import java.util.Scanner;

/**
 * Student class placed inside the studentinfo package.
 * Holds student details and provides methods to accept details,
 * display them and calculate the grade based on marks.
 */
public class Student {
    // Stores the unique identification number of the student.
    int studentId;
    // Stores the full name of the student.
    String studentName;
    // Stores the course in which the student is enrolled.
    String course;
    // Stores the marks obtained by the student (out of 100).
    double marks;

    /**
     * Accepts student details from the user using a Scanner.
     */
    public void acceptDetails() {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the student ID.
        System.out.print("Enter Student ID: ");
        // Read the integer typed by the user and store it in studentId.
        studentId = sc.nextInt();
        // Prompt the user to enter the student name.
        System.out.print("Enter Student Name: ");
        // Consume the leftover newline character so the next nextLine() is not skipped.
        sc.nextLine();
        // Read the whole name line and store it in studentName.
        studentName = sc.nextLine();
        // Prompt the user to enter the course.
        System.out.print("Enter Course: ");
        // Read the whole course line and store it in course.
        course = sc.nextLine();
        // Prompt the user to enter the marks.
        System.out.print("Enter Marks: ");
        // Read the decimal value typed by the user and store it in marks.
        marks = sc.nextDouble();
    }

    /**
     * Displays the accepted student details.
     */
    public void displayDetails() {
        // Print the student ID stored in the object.
        System.out.println("Student ID: " + studentId);
        // Print the student name stored in the object.
        System.out.println("Student Name: " + studentName);
        // Print the course stored in the object.
        System.out.println("Course: " + course);
        // Print the marks stored in the object.
        System.out.println("Marks: " + marks);
    }

    /**
     * Calculates and returns the grade based on marks.
     * 90-100 A+, 80-89 A, 70-79 B, 60-69 C, below 60 D.
     */
    public char calculateGrade() {
        // If marks fall in the 90-100 range, the grade is 'A' (A+ is appended below for readability).
        if (marks >= 90 && marks <= 100) {
            return 'A'; // returned as 'A' with '+' appended below for readability
        } else if (marks >= 80) {
            // Marks between 80 and 89 earn an 'A' grade.
            return 'A';
        } else if (marks >= 70) {
            // Marks between 70 and 79 earn a 'B' grade.
            return 'B';
        } else if (marks >= 60) {
            // Marks between 60 and 69 earn a 'C' grade.
            return 'C';
        } else {
            // Any marks below 60 earn a 'D' grade.
            return 'D';
        }
    }

    /**
     * Returns a String version of the grade so A+ can be shown correctly.
     */
    public String getGrade() {
        // If marks fall in the 90-100 range, return "A+" as a String.
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80) {
            // Marks between 80 and 89 return the "A" grade.
            return "A";
        } else if (marks >= 70) {
            // Marks between 70 and 79 return the "B" grade.
            return "B";
        } else if (marks >= 60) {
            // Marks between 60 and 69 return the "C" grade.
            return "C";
        } else {
            // Any marks below 60 return the "D" grade.
            return "D";
        }
    }
}