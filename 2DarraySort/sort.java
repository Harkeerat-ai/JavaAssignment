import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int x=0;x<r;x++){
                    for(int y=0;y<c;y++){
                        if(a[i][j] < a[x][y]){
                            int temp=a[i][j];
                            a[i][j]=a[x][y];
                            a[x][y]=temp;
                        }
                    }
                }
            }
        }

        System.out.println("Sorted Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}