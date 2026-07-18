import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string : ");
        String text = sc.next();
        text = text.toLowerCase();
        boolean isPalindrome = true;
        for(int i = 0; i<=text.length() / 2; i++){
            if(text.charAt(i) != text.charAt(text.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println(text + " is a palindrome!!");
        else System.out.println(text + " is not a palindrome!!");
    }
}