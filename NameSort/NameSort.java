import java.util.Scanner;

public class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String names[] = new String[n];

        System.out.println("Enter names:");

        for(int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Bubble Sort
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");

        for(int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}