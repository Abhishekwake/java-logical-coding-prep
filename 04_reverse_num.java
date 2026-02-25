import java.util.Scanner;

class Demo {
 public static void main(String[] args) {
        System.out.println("Enter Number to Reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num < 0) { num = num * -1;}
        while(num>0) {
        int lastdigit = num % 10;
        System.out.print(lastdigit);
        num = num /10;
        }
    }
}

// num = 7891
// lastdigit = 789%10=

