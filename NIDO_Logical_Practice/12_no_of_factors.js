const prompt = require("prompt-sync")();
console.log("Enter the number till which you have to print factors");
const num = parseInt(prompt(""));
let i = 1 ;
let count = 0;
while(i <= num ){
    if(num % i=== 0){
        console.log(i);
        count = count +1;
    }
    i++;
}
console.log("no of factors is "+count)