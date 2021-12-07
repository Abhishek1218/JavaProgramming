public class stringLen {
    public static void main(String[] args) {
        String str = "This is a string";
        // String[] words = str.split(" ");
        // char ch[] = str.toCharArray();
        // String str1 = str.replace(" ","");
        // System.out.print(str1.length());

        str = str+" ";
        int start = 0;
        for(int i = 0; i<str.length(); i++){

            // Iterate through each element of word
            char ch = str.charAt(i);
            // When any space encountered 
            if(ch == ' '){
                String word = str.substring(start, i);
                System.out.println(word+" - "+word.length());
                start = i+1;
            }
        }
    }
}
