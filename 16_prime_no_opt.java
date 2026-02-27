import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        System.out.println("Enter the no to for prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isprime(n));


    }
    public static boolean isprime(int n){
    int count = 0;
    for(int i =1;i*i<=n ;i++){
        if(n%i==0){
            if(i==n/i){
                count++;
            }else{
                count=count+2;
            }
        }
    }
    if(count==2){
        return true;
    }else{
        return false;
    }
    }
}