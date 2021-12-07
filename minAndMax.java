import java.util.*;

public class minAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for ( int i = 0 ; i<n; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0], min = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);

        for(int i = 1 ; i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Minimum element of array is: "+min);
    }
}
