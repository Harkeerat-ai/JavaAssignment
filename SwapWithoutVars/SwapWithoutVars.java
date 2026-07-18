import java.util.Scanner;
public class SwapWithoutVars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swapping are A : " + a + " and B : " + b);
    }
}