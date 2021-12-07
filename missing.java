import javax.naming.spi.DirStateFactory.Result;

public class missing {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,5,6};
        int n = arr.length;
        int x = 6;
        int sum = (x*(x+1))/2;
        int missNo = 0;
        int res = 0;
        for(int i =0 ; i<n; i++){
            res = res + arr[i];
        }   
        missNo = sum - res;
        System.out.print("Missing number: ");
        System.out.print(missNo);

    }
    
}
