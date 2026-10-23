const prompt = require('prompt-sync')();

const num = parseInt(prompt("Enter a number: "));

let count = 0;

for (let i = 1; i <= num; i++) {
    if (num % i === 0) {
        count++;
    }
}

if (count === 2) {
    console.log(num + " is a Prime number");
} else {
    console.log(num + " is NOT a Prime number");
}

// Yes! 🔥 That's another correct method to check prime numbers. You can count the total number of divisors and then decide whether the number is prime.

// ## JavaScript program using the count method

// ```
// const prompt = require('prompt-sync')();

// const num = parseInt(prompt("Enter a number: "));

// let count = 0;

// for (let i = 1; i <= num; i++) {
//     if (num % i === 0) {
//         count++;
//     }
// }

// if (count === 2) {
//     console.log(num + " is a Prime number");
// } else {
//     console.log(num + " is NOT a Prime number");
// }
// ```

// ## How does it work?

// Suppose you enter `5`.

// | Number checked (`i`) | `5 % i === 0`? | Count |
// | -------------------- | -------------- | ----- |
// | 1                    | Yes            | 1     |
// | 2                    | No             | 1     |
// | 3                    | No             | 1     |
// | 4                    | No             | 1     |
// | 5                    | Yes            | 2     |

// The total count is `2`, so 5 is prime.

// Now suppose you enter `6`.

// | Number checked (`i`) | Divisible? | Count |
// | -------------------- | ---------- | ----- |
// | 1                    | Yes        | 1     |
// | 2                    | Yes        | 2     |
// | 3                    | Yes        | 3     |
// | 4                    | No         | 3     |
// | 5                    | No         | 3     |
// | 6                    | Yes        | 4     |

// The total count is `4`, so 6 is not prime.

// ## Remember this logic

// - `count === 2` → Prime number.
// - `count > 2` → Not prime.
// - `count < 2` → Not prime, including 0, 1 and negative numbers with this loop.

// Interview tip: Your count method is easier to understand as a beginner. The earlier method using `return false` is more efficient because it stops as soon as it finds a divisor. Both methods are valid.