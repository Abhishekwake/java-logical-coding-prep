//prime nos are numbers which are greater than 1 , 0 and 1 is not prime 
//and which are divisble by 1 and itselft 
//it has 2 factorial 

//take input 
const prompt = require('prompt-sync')();
const  number = parseInt(prompt("Enter the positive number"));

    function isPrime(num) {
        if(num<=1) return false;
        // Start from 2 and check divisors only up to the square root of the number.
        for(let i = 2;i<=Math.sqrt(num);i++){
            if(num % i === 0) return false;
        }
        return true;
    }

if(isPrime(number)){
    console.log("Given Number Is Prime Number");
}else{
    console.log("Given Number Is Not A Prime Number")
}