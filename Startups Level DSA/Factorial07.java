public class Factorial07 {
    public static void main(String[] args) {
      System.out.println(Factorial(5));
    }
    public static int Factorial(int n){
        //base condition
        if(n==1 || n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }

}
// Factorial Using Recursion