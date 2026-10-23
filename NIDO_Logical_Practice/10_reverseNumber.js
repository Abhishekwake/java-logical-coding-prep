// Logic: Extract the last digit, add it to the reversed number, and remove it from the original number
let num = 985;
let rev = 0;

while(num!=0){
    let lastDigit = num % 10;
    rev = rev *10 + lastDigit;
    num = Math.floor(num/10);
    // But we need to remove the last digit completely. So use: This turns 98.5 into 98.
}
console.log(rev);