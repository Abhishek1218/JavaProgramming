public class selSort {
    public static void main(String[] args) {
        int arr[] = {10,20,15,13,4};

        for(int i = 0; i<arr.length; i++){
            int sel = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[sel]>arr[j]){
                    sel = j;
                }
            }
            int temp = arr[sel];
            arr[sel] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array: ");
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
