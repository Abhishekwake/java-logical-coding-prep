const prompt = require("prompt-sync")();

console.log("Enter the length of the arrays");
const n = parseInt(prompt(""))

const arr = [];
for(let i = 0 ; i<n ;i++){
    arr[i] = parseInt(prompt(""));
}
let sum = 0;
for(let i = 0 ; i<n ;i++){
    sum = sum+ arr[i] 
}
console.log("The Sum Of Arrays is " + sum);