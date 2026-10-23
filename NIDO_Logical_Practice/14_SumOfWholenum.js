// Program 3: Sum of Natural Numbers (1 to n)
// Code
// javascript
const prompt = require("prompt-sync")();

console.log("Enter the number till which we have to find sum");
const n = parseInt(prompt(""));

console.log(sumTill(n));

function sumTill(n) {
    return n * (n + 1) / 2;
}

//
// Sample Run
// text
// Enter the number till which we have to find sum
// 6
// 21
// What it computes
// Sum of natural numbers from 1 to n:

// text
// 1 + 2 + 3 + ... + n
// For n = 6: 1 + 2 + 3 + 4 + 5 + 6 = 21 ✅

// Why n × (n + 1) / 2 works — Same Gauss Trick
// Step 1: Write forward

// text
// S = 1 + 2 + 3 + ... + n
// Step 2: Write backward

// text
// S = n + (n-1) + (n-2) + ... + 1
// Step 3: Add both rows column-by-column

// text
//    1      + 2      + 3      + ... + n
// +  n      + (n-1)  + (n-2)  + ... + 1
// ────────────────────────────────────────
//   (n+1)   + (n+1)  + (n+1)  + ... + (n+1)
// Every column sums to (n + 1), and there are n columns.

// Step 4: Solve

// text
// 2S = n × (n + 1)
// S  = n × (n + 1) / 2   ✅
// Visual Example: n = 6
// text
// Forward:    1  2  3  4  5  6
// Backward:   6  5  4  3  2  1
// ────────────────────────────
// Column sum: 7  7  7  7  7  7   ← each = (n+1) = 7

// Total = 6 columns × 7 = 42
// Halve it → 42 / 2 = 21  ✅
// 🔑 How the Two Formulas Are Related
// Program 3's formula with (n-1) substituted for n gives Program 2's formula:

// text
// Program 3 with (n-1):  (n-1) × ((n-1) + 1) / 2
//                      = (n-1) × n / 2
//                      = n × (n-1) / 2   ← exactly Program 2 ✅
// So Program 2 is just Program 3 shifted by one term.

// The difference between the two sums is always n:

// text
// Sum(1 to n) − Sum(0 to n−1)
// = n(n+1)/2 − n(n−1)/2
// = n[(n+1) − (n−1)] / 2
// = n × 2 / 2
// = n
// Quick Check for n = 6:
// text
// Sum(1 to 6)   = 21
// Sum(0 to 5)   = 15
// Difference    = 6 = n  ✅
// 📊 Side-by-Side Comparison
// Aspect	Program 2	Program 3
// Formula	n(n−1)/2	n(n+1)/2
// Starts from	0	1
// Ends at	n − 1	n
// Number of terms	n	n
// Each pair sums to	n − 1	n + 1
// For n = 6	0+1+2+3+4+5 = 15	1+2+3+4+5+6 = 21
// 🎯 Why the Gauss Trick Works (Both Formulas)
// The idea is the same for both:

// Pair the smallest with the largest

// Every pair adds up to the same number

// Count how many pairs exist

// Multiply pair-sum × pair-count, then divide by 2 (because we doubled the sum by writing it twice)

// For 0 to n−1: each pair = n−1, total pairs = n → sum = n(n−1)/2
// For 1 to n: each pair = n+1, total pairs = n → sum = n(n+1)/2

// Legend: Young Gauss (age 10) used this exact trick to sum 1 to 100 instantly — he paired 1+100, 2+99, 3+98, ... getting 50 pairs of 101 each → 50 × 101 = 5050.

