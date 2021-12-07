import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];

        for(i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");

        int search = sc.nextInt();

        for(i = 0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("Element found at: "+i+" position");
            }
        }
        if(i == n){
            System.out.print("Element not found");
        }

    }    
}
