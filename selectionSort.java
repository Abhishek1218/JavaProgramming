public class selectionSort {
    public static void main(String[] args) {
       int arr[] = {10, 7, 9, 15, 2, 24};
       for(int i = 0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
       } 

       for(int i =0; i<arr.length-1; i++ ){
           int smallest = i;
           for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
           }
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }
       System.out.println();

       System.out.print("Elements after swapping: ");
       for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    } 
    }
}
