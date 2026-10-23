let arr = [10, 5, 20, 8, 15];
let largest = -Infinity;
let secondLargest = -Infinity;

for(let i = 0; i<arr.length ; i++){
    if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
        // This prevents duplicates of the largest from becoming secondLargest.
    } else if(arr[i] > secondLargest && arr[i] !== largest){  

        secondLargest = arr[i];
    }
}
console.log("Largest:", largest);
console.log("Second largest:", secondLargest);