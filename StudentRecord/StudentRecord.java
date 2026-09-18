// Import Scanner: used to read student details (ID, name, course, marks) typed on the keyboard.
import java.util.Scanner;

/**
 * Student class representing a student record with ID, name, course
 * and marks in three subjects. Demonstrates default and parameterized constructors.
 */
class Student {
    // Unique identifier assigned to the student.
    int studentID;
    // Name of the student.
    String studentName;
    // The course in which the student is enrolled.
    String course;
    // Marks secured by the student in the AAS subject.
    double marksAAS;
    // Marks secured by the student in the JAVA subject.
    double marksJAVA;
    // Marks secured by the student in the Python subject.
    double marksPython;

    /**
     * Default constructor: creates an empty Student record using placeholder values.
     */
    Student() {
        // Store 0 as a placeholder ID because none was supplied.
        studentID = 0;
        // Store "Unknown" as the name because no name was supplied.
        studentName = "Unknown";
        // Store "Not Assigned" as the course because no course was supplied.
        course = "Not Assigned";
        // Start all three subject marks at 0.
        marksAAS = 0;
        marksJAVA = 0;
        marksPython = 0;
    }

    /**
     * Parameterized constructor: creates a Student using all the values passed in.
     */
    Student(int id, String name, String c, double aas, double java, double python) {
        // Copy the supplied ID into the instance field.
        studentID = id;
        // Copy the supplied name into the instance field.
        studentName = name;
        // Copy the supplied course into the instance field.
        course = c;
        // Store the AAS marks in the instance field.
        marksAAS = aas;
        // Store the JAVA marks in the instance field.
        marksJAVA = java;
        // Store the Python marks in the instance field.
        marksPython = python;
    }

    /**
     * Accepts the student details from the user through the keyboard.
     */
    void acceptDetails() {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter the student ID.
        System.out.print("Enter Student ID: ");
        // Read the integer (student ID) typed by the user and store it in the field.
        studentID = sc.nextInt();
        // Consume the leftover newline character so the next read works correctly.
        sc.nextLine();
        // Ask the user to enter the student name.
        System.out.print("Enter Student Name: ");
        // Read the whole line (the name) and store it in the field.
        studentName = sc.nextLine();
        // Ask the user to enter the course.
        System.out.print("Enter Course: ");
        // Read the whole line (the course) and store it in the field.
        course = sc.nextLine();
        // Ask the user to enter the marks in AAS.
        System.out.print("Enter Marks in AAS: ");
        // Read the double (AAS marks) and store it in the field.
        marksAAS = sc.nextDouble();
        // Ask the user to enter the marks in JAVA.
        System.out.print("Enter Marks in JAVA: ");
        // Read the double (JAVA marks) and store it in the field.
        marksJAVA = sc.nextDouble();
        // Ask the user to enter the marks in Python.
        System.out.print("Enter Marks in Python: ");
        // Read the double (Python marks) and store it in the field.
        marksPython = sc.nextDouble();
    }

    /**
     * Calculates and returns the total marks in all three subjects.
     */
    double calculateTotal() {
        // Sum the marks of AAS, JAVA and Python and return the result.
        return marksAAS + marksJAVA + marksPython;
    }

    /**
     * Calculates and returns the percentage (total marks divided by the number of subjects).
     */
    double calculatePercentage() {
        // Divide the total marks by 3 (three subjects) to get the percentage.
        return (calculateTotal() / 3);
    }

    /**
     * Displays all the student details along with the total and percentage.
     */
    void displayDetails() {
        // Print the student ID stored in the object.
        System.out.println("Student ID: " + studentID);
        // Print the student name stored in the object.
        System.out.println("Student Name: " + studentName);
        // Print the course stored in the object.
        System.out.println("Course: " + course);
        // Print the marks in AAS.
        System.out.println("Marks in AAS: " + marksAAS);
        // Print the marks in JAVA.
        System.out.println("Marks in JAVA: " + marksJAVA);
        // Print the marks in Python.
        System.out.println("Marks in Python: " + marksPython);
        // Print the total marks calculated by calculateTotal().
        System.out.println("Total Marks: " + calculateTotal());
        // Print the percentage calculated by calculatePercentage().
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

/**
 * Demonstrates classes and objects using default and parameterized constructors.
 */
public class StudentRecord {

    /**
     * Main method: creates two Student objects (one via each constructor),
     * accepts details and displays the records.
     */
    public static void main(String[] args) {
        // Create the first student using the default constructor (all placeholder values).
        Student s1 = new Student();
        // Fill the first student's details through the keyboard.
        s1.acceptDetails();
        // Print a header showing that this is the default-constructor student.
        System.out.println("\n--- Student 1 (Default Constructor) ---");
        // Display the complete record of the first student.
        s1.displayDetails();

        // Create the second student using the parameterized constructor with fixed values.
        Student s2 = new Student(101, "Harkeerat", "BSC-CS", 85.5, 90.0, 78.5);
        // Print a header showing that this is the parameterized-constructor student.
        System.out.println("\n--- Student 2 (Parameterized Constructor) ---");
        // Display the complete record of the second student.
        s2.displayDetails();
    }
}