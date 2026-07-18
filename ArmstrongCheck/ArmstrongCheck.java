import java.util.Scanner;
import java.lang.Math;
public class ArmstrongCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int tempc =  num, tempa = num;
        int sum = 0;
        int count = 0;

        while(tempc>0){
            count++;
            tempc /= 10;
        }

        while(tempa > 0){
            int digit = tempa % 10;
            sum += Math.pow(digit,count);
            tempa /= 10;
        }
        
        if (sum == num) System.out.println(num + " is an armstrong number!");
        else System.out.println(num + " is not an armstrong number!");
        
    }
}