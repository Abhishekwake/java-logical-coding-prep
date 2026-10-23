const prompt = require("prompt-sync")();
const number = parseInt(prompt("Enter A Number"));

    function isPrime(num) {
    if (num <= 1) {
        return false;
    }
    // We don't check 1 and 5 because we already know they divide 5 exactly
    for (let i = 2; i < num; i++) {
        if(num % i === 0){
            return false;
        }
    }
    return true;
    }   

    if(isPrime(number))
    {
        console.log("Prime Number");
    }else{
        console.log("Not a prime Number");
    }

    
