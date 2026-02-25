import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Enter A Num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0 || num % 3 == 0){
            System.out.println("Num is divisible by 2,3");
        }else{
            System.out.println("Num is not divisible by 2,3");
        }
    }
}
