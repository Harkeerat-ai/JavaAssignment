import java.util.Scanner;
public class FibbonaciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the range of the series : ");
        int range = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Series : \n" + a);
        for(int i = 1; i<=range; i++){
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}