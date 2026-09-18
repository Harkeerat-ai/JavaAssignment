import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Reads the content of "JavaFile1.txt" and copies it to
 * "JavaFile2.txt" using file streams.
 */
public class Q2_CopyFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("JavaFile1.txt");
             FileOutputStream out = new FileOutputStream("JavaFile2.txt")) {

            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            System.out.println("Content copied from JavaFile1.txt to JavaFile2.txt");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}