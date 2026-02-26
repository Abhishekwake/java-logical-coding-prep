import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Enter the no to calculate the factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
           for(int i =1 ;i<=n;i++){
            ans = ans * i;
           }
        System.out.println(ans);
    }
}
