import java.util.Scanner;

class Demo {
 public static void main(String[] args) {
        System.out.println("Enter Number to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime");
        }
    }
}

// First: What is a Prime Number?

// A prime number is:

// A number greater than 1

// Has only 2 factors

// 1

// Itself

// Examples:

// 2 → Prime (1,2)

// 3 → Prime (1,3)

// 4 → Not prime (1,2,4)

// 5 → Prime (1,5)

// 6 → Not prime (1,2,3,6)