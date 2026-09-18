// Import Student: the class from the studentinfo package that holds the student details
// and provides the methods to accept, display and grade the data. Because StudentTest is
// placed outside the studentinfo package, it must be imported to be usable here.
import studentinfo.Student;

/**
 * StudentTest class placed outside the studentinfo package.
 * Imports the studentinfo.Student class, accepts details and
 * displays the student information along with the grade.
 */
public class StudentTest {
    public static void main(String[] args) {
        // Create a new Student object. All its fields start with default values
        // (0 / null) until acceptDetails() fills them in.
        Student student = new Student();

        // Ask the user to type in the student details and store them inside the student object.
        student.acceptDetails();

        // Print a blank line to keep the output tidy.
        System.out.println();
        // Print a heading so the user knows the student information is coming next.
        System.out.println("--- Student Information ---");
        // Display all the details that were accepted earlier.
        student.displayDetails();
        // Print the grade (e.g. A+) calculated from the marks stored in the student object.
        System.out.println("Grade: " + student.getGrade());
    }
}