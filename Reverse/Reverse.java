import java.util.StringTokenizer;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            // Reverse the word
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }

        sc.close();
    }
}