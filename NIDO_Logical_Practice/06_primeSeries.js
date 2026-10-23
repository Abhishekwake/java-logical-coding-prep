function isPrime(num) {
 if(n<=1){
    return false;
 }
 for(let i = 2;i<= Math.sqrt(num);i++){
        if(num%i=== 0) return false;
 }   
 return true;
}
let n = 20 ;
for(let i = 2;i<=n;i++) {
    if(isPrime(i)){
        console.log(i+ " ");
    }
}