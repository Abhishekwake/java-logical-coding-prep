import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        System.out.println("Enter The No Of Words");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n/2+1;
        int nsp = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("_");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<= n/2){
                nst=nst-1;
                nsp=nsp+2;
            }else{
                nst=nst+1;
                nsp=nsp-2;
            }

        }

    }
}