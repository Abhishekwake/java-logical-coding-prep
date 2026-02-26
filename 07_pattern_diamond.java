import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n / 2;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("_");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                nsp--;
                nst = nst + 2;
            }else{
                nsp++;
                nst=nst-2;
            }
            
        }
    }

}
