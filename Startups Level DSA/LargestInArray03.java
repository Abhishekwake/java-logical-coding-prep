public class LargestInArray03 {
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
    int[] arr = {10,6,4,24,1};
    System.out.println(largest(arr));
    }
}
// ✅ Concepy Array Traversal