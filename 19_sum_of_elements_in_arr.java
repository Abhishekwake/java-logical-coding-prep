import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        System.out.println("Enter the lentgh of the array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            count = count + arr[i];
        }
        System.out.println(count);
    }
}