import java.util.*;
public class removeDuplicates05 {
    public static void main(String[] args) {
        int[] arr = {5,5,7,8,8};
        int x = 0;// Points to last unique element
        if(arr.length==0 ){
            System.out.println("Array is empty");
            return;
        }
        for(int i =1;i<arr.length;i++){
            if(arr[i]!=arr[x]){
               // Found a new unique element!

                x = x + 1;// Move x to next position
                arr[x]=arr[i];// Put the unique element there

            }
        }
        // Print the unique elements only
        System.out.println("Unique elements: ");
        for(int i = 0; i <= x; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("New length: " + (x + 1));

    }
}
// Two Pointer Arrays
// [5,5,7,8,8,9,9,10,10]