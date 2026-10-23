const prompt = require("prompt-sync")();

console.log("Enter the number till which we have to find sum");
const n = parseInt(prompt(""));

console.log(sumTill(n));

function sumTill(n) {
    return n * (n + 1) / 2;
}




// text
// 0 + 1 + 2 + 3 + ... + (n - 1)
// For n = 6: 0 + 1 + 2 + 3 + 4 + 5 = 15 ✅

// Why n × (n - 1) / 2 works — Gauss Trick
// Step 1: Write the sum forward

// text
// S = 0 + 1 + 2 + ... + (n-2) + (n-1)
// Step 2: Write it backward

// text
// S = (n-1) + (n-2) + ... + 1 + 0
// Step 3: Add both rows column-by-column

// text
//    0      + 1      + 2      + ... + (n-1)
// + (n-1)   + (n-2)  + (n-3)  + ... + 0
// ─────────────────────────────────────────
//   (n-1)   + (n-1)  + (n-1)  + ... + (n-1)
// Every column sums to (n - 1), and there are n columns.

// Step 4: Solve

// text
// 2S = n × (n - 1)
// S  = n × (n - 1) / 2   ✅
// Visual Example: n = 6
// text
// Forward:    0  1  2  3  4  5
// Backward:   5  4  3  2  1  0
// ────────────────────────────
// Column sum: 5  5  5  5  5  5   ← each = (n-1) = 5

// Total = 6 columns × 5 = 30
// Halve it → 30 / 2 = 15  ✅
