import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        
        
        //Input value in matrix

        for(int i = 0 ; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int row_start = 0, row_end = n-1, col_start = 0, col_end = m-1;

        while(row_start<=row_end && col_start<=col_end){

            //for row start
            for(int col = col_start; col<= col_end; col++){
                System.out.print(arr[row_start][col]+" ");
            }
            row_start++;

            //for column end

            for(int row = row_start; row<=row_end; row++){
                System.out.print(arr[row][col_end]+" ");
            }
            col_end--;

            //for row end
            for(int col = col_end; col>=col_start; col--){
                System.out.print(arr[row_end][col]+" ");
            }
            row_end--;

            //for column start
            for(int row = row_end; row>=row_start; row--){
                System.out.print(arr[row][col_start]+" ");
            }
            col_start++;
        }

    }
}
