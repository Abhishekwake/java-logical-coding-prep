import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Enter the no to calculate the factorial");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact = nfact * i;
        }
        int rfact = 1;
        for (int i = 1; i <= r; i++) {
            rfact = rfact * i;
        }
        int nmrfact = 1;
        for (int i = 1; i <= (n - r); i++) {
            nmrfact = nmrfact * i;
        }
        System.out.println(nfact / (rfact * nmrfact));

    }
}
