// Factorial is computed by multiplying all integers from 1 to n using a loop. 
// Initialize a variable ans as 1 
// Update by multiplyingz it with the current iteration number

let num = 5
 console.log(factorial(num));
function factorial(num) {
    let fact = 1;
    for(let i = 2;i <= num; i++){
    fact = fact * i;
    }
    return fact;
}

// Factorial is defined recursively as n! = n × (n - 1)!. 
// Define a base case where if n equals 0 or 1, the function returns 1. 
// If not base case, the function calls itself with n minus 1, breaking the problem into smaller subproblems until reaching the base case