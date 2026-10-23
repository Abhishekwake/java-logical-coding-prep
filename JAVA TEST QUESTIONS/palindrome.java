/**
 * palindrome
 */
public class palindrome {

     public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int digit = num % 10;   
            rev = rev*10 + digit;
            temp /=10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrom");
        }
     }
}