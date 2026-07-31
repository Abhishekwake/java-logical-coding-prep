public class Fibonacci {
    public static void main(String[] args) {
            System.out.println(nthFibonacci(5));
    }
    public static int nthFibonacci(int n){
        // base case
        if (n <= 1) {
            return n;
        }
        // sum of the two preceding
        // Fibonacci numbers
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}
// number pattern where each number is the sum of the two numbers before it, 
// starting with 0 and 1: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...