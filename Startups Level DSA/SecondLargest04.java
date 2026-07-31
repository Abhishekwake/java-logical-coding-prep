public class SecondLargest04 {
    public static int largest(int[] arr){
        int largest = arr[0];
        int secondLargest=-1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>largest)
            {   
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i] > secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
    int[] arr = {10,6,4,24,1};
    System.out.println(largest(arr));
    }
}
// Concept: Track largest and second largest
// Array Traversal
// User function Template for Java

// class Solution {
    
//     public int getSecondLargest(int[] arr) {
        
//         int n = arr.length;                     // Get array length
        
//         int largest = arr[0];                   // Assume first element is largest
//         int secondLargest = -1;                 // -1 means "not found yet"
        
//         // Loop through array starting from index 1
//         for(int i = 1; i < n; i++) {
            
//             // Case 1: Found a new largest number
//             if(arr[i] > largest) {
//                 secondLargest = largest;        // Old largest becomes second largest
//                 largest = arr[i];               // Update largest with new number
//             } 
            
//             // Case 2: Found a number between largest and second largest
//             else if(arr[i] < largest && arr[i] > secondLargest) {
//                 secondLargest = arr[i];         // Update second largest
//             }
//         }
        
//         return secondLargest;                   // Return the second largest number
//     }
// }