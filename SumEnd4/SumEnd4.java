import java.util.*;
public class SumEnd4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter rows of the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Please enter columns of the matrix : ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Please enter element at position : " + i + "," + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]%10 == 4){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum + " is the sum of all numbers ending in 4");
    }
}