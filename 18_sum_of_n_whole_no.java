import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        System.out.println("Sum of n whole number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sumTill(n));


    }
    public static int sumTill(int n){
    return  (n - 1) * n / 2;
    }
}