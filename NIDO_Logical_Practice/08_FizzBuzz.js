// FizzBuzz is a classic programming screening test and children's division game.
// The Rules
// • Count incrementally from 1 to 100 (or a given integer n).
// • If a number is divisible by 3 and 5, print "FizzBuzz".
// • If a number is divisible by 3, print "Fizz".
// • If a number is divisible by 5, print "Buzz".
// • Otherwise, print the number itself
n=100;
for(let i = 1;i <= n; i++){
    if(i%3===0 && i%5===0){
        console.log("FizzBuzz");
    }else if(i%3 === 0){
        console.log("Fizz");
    }else if(i%5 === 0) {
        console.log("Buzz");
    }else{
        console.log(i);
    }
}