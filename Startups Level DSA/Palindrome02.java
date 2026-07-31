public class Palindrome02 {
      public static void main(String[] args){
        String str = "hhh";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        } 
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        
    }
}
// Reverse + Compare