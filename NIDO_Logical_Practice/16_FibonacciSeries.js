
// ## Fibonacci Series in JavaScript

// The Fibonacci series is a sequence where each number is the sum of the previous two numbers.

// `0, 1, 1, 2, 3, 5, 8, 13, 21, 34...`

let n = 10;

let a = 0;
let b = 1;
for(let i = 1; i<=n;i++){
    console.log(a); // ✅ print the current Fibonacci number not the counter

    let next = a + b;
    a = b;
    b = next;
    
}


// ## 1. Beginner-friendly solution using a `for` loop

// ```
// let n = 10;

// let a = 0;
// let b = 1;

// for (let i = 1; i <= n; i++) {
//     console.log(a);

//     let next = a + b;
//     a = b;
//     b = next;
// }
// ```

// Output:

// ```
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
// ```

// ## 2. Understand the logic

// These three variables are important:

// - `a` — current Fibonacci number.
// - `b` — next Fibonacci number.
// - `next` — sum of `a + b`.

// The key lines are:

// ```
// let next = a + b;
// a = b;
// b = next;
// ```

// They calculate the next number and move the sequence forward.

// ## 3. Dry run

// For `n = 6`:

// | Iteration | `a` (printed) | `b` | `next = a + b` |
// | --------- | ------------- | --- | -------------- |
// | 1         | 0             | 1   | 1              |
// | 2         | 1             | 1   | 2              |
// | 3         | 1             | 2   | 3              |
// | 4         | 2             | 3   | 5              |
// | 5         | 3             | 5   | 8              |
// | 6         | 5             | 8   | 13             |

// Output: `0 1 1 2 3 5`

// Interview tip: If the interviewer asks for the first 10 Fibonacci numbers, use this code. If they ask for all Fibonacci numbers up to a given limit, the loop condition needs to change.