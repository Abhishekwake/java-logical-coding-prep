import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Enter the no to calculate the factorial");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();

        int nfact = fact(n);
        int rfact =fact(r);
        int nmrfact = fact(n-r);
        int ans = nfact / (rfact * nmrfact);

    }
    public static int fact(int n) {
    int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
