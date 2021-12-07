import java.util.*;

public class twoDsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == n){
                    System.out.print("Number is present at: "+i+","+j);
                }
            }
    }
}
}