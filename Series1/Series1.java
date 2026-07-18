import java.util.Scanner;

public class Series1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the range of the series : ");
        int range = sc.nextInt();

        double sum = 0;
        double div =0;
        for(int i=1; i<=range;i++){
            double exp = i*i;
            double fact=1;
            for(int j=1; j<=i;j++){
                fact *= j;
                //System.out.println(fact);
            }
            div = exp/fact;
            sum += div;
        }
        System.out.println("Sum of the series for the range : " + range + " = " + sum);
    }
}