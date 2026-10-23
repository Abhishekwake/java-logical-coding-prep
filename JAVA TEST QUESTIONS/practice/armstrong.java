package practice;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//153
        int orgNum = num;
        int digitCount = 0;
        while (num!=0) {
            digitCount++;
            num= num /10;
        }
        num = orgNum;
        int sum =0;
        while (num!=0) {
            int digit = num%10;
            sum= sum + (int)Math.pow(digit,digitCount);
            num = num /10;
        }
        if(sum == orgNum ){
            System.out.println("armsrtrng");
        }else{
            System.out.println("not a armstorng");
        }
        

    }
}
