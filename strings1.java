import java.util.*;

public class strings1 {
    public static void main(String[] args) {
        
        // Total length of letters in string
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // String arr[] = new String[size];
        // int totLength = 0;

        // for(int i = 0 ;i<size; i++){
        //     arr[i] = sc.next();
        //     totLength += arr[i].length();
        // }
        // System.out.println(totLength);


        //Replace a letter with another
        // System.out.print("Enter the string: ");    
        // String str = sc.next();

        //     String result = "";

        //     for(int i = 0 ; i<str.length(); i++){
        //         if(str.charAt(i) == 'e'){
        //             result += 'i';
        //         }
        //         else{
        //             result += str.charAt(i);
        //         }
        //     }
        //     System.out.println(result);

        //To get username from email
        System.out.print("Please enter your email: ");
        String email = sc.next();
         String userName = "";
 
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
            break;
       }    else {
                userName += email.charAt(i);
         }
     }
 
     System.out.println("Your username is: "+userName);

    }
}
