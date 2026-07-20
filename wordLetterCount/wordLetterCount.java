import java.util.*;
public class wordLetterCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter text : ");

        String text = sc.nextLine();

        char arr[] = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int word=1,letter=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' ') word++;
            else letter++;
        }
        System.out.println("Number of words = " + word + " and Number of letters = " + letter);
    }
}