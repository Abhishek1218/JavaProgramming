import java.util.*;

public class factFunction {
    static void fact(int n){
        int Factorial = 1;
       for(int i = 1; i<=n; i++){
           Factorial = Factorial *i; 
       }
       System.out.println(Factorial);
       return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fact(n);
    }
}
