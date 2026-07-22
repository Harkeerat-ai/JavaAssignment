import java.util.*;
public class UpperDiag{
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
        int product=1;
        System.out.println();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i<=j){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
        
    }
}