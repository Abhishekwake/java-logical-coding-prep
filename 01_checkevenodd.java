import java.util.Scanner;
class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Num is even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}