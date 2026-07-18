import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to find its sum of digits : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of digits = " + sum);
    }
}