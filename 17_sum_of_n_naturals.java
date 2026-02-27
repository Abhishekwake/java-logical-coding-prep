import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        System.out.println("Entet the number till which we have to find sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sumTill(n));


    }
    public static int sumTill(int n){
    return n*(n+1)/2;
    }
}