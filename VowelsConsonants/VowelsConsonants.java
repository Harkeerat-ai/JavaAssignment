import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        String text = sc.next().toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (text.charAt(i) == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Vowels = " + count);
        System.out.println("Consonants = " + (text.length() - count));
    }
}