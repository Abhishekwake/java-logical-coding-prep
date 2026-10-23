//10 no of people , handshakes without repeating
let n = 10;
let handshakes = 0;
for(let i = 1; i <= n; i++){
    for(let j = i+1 ; j <=n ;j++){
        handshakes++;
    }
}
console.log("total no of handshakes required ",handshakes) 

//

// 4. Interview optimization
// Once you've explained the loop, you can use the formula:

// let n = 40;
// let handshakes = n * (n - 1) / 2;

// console.log("Total handshakes:", handshakes);


// Output: 780

// Interview tip: The loop solution checks every unique pair, while the formula calculates the answer directly. The formula is more efficient for large numbers