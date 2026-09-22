/**
 * Student class demonstrating the use of the static keyword.
 */
class Student {
    // Roll number that uniquely identifies each student (stored per object).
    int rollNumber;
    // Name of the student (stored per object).
    String studentName;

    // Static data members shared by all objects (one single copy for the whole class).
    static String collegeName = "Mithibai College";
    static int count = 0;

    /**
     * Parameterized constructor: creates a Student with the given roll number and name.
     */
    Student(int roll, String name) {
        // Copy the passed-in roll number into the instance field.
        rollNumber = roll;
        // Copy the passed-in name into the instance field.
        studentName = name;
        // Increment the shared static counter for every new Student object created.
        count++;
    }

    /**
     * Displays the details of this particular student.
     */
    void display() {
        // Print the roll number stored in this object.
        System.out.println("Roll Number: " + rollNumber);
        // Print the name stored in this object.
        System.out.println("Student Name: " + studentName);
        // Print the shared static college name (same for every student).
        System.out.println("College Name: " + collegeName);
        // Print a blank line to separate each student's details.
        System.out.println();
    }

    /**
     * Static method to display the total number of students created.
     */
    static void totalStudents() {
        // Print the shared static counter that counts all Student objects.
        System.out.println("Total Students: " + count);
    }
}

/**
 * Demonstrates the use of the static keyword in a Student Management System.
 */
public class StaticKeyword {

    /**
     * Main method: creates three Student objects to demonstrate static members,
     * then displays each student and the total student count.
     */
    public static void main(String[] args) {
        // Create the first Student using the parameterized constructor.
        Student s1 = new Student(1, "Harkeerat");
        // Create the second Student using the parameterized constructor.
        Student s2 = new Student(2, "Rahul");
        // Create the third Student using the parameterized constructor.
        Student s3 = new Student(3, "Priya");

        // Display the details of the first student.
        s1.display();
        // Display the details of the second student.
        s2.display();
        // Display the details of the third student.
        s3.display();

        // Static method can be called directly using the class name
        // Call the static method using the class name (no object needed).
        Student.totalStudents();
    }
}