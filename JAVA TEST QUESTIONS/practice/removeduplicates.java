package practice;

public class removeduplicates {
   public static void main(String[] args) {
     int[] arr = {10, 20, 10, 20, 40, 10, 50};
    for(int i = 0;i < arr.length;i++){
        boolean already = false;
        for(int j = 0 ; j<i;j++){
            if( arr[i]==arr[j] ){
                already = true;
            }
        }
        if(!already){
            System.out.print(arr[i] + " ");
        }

    }
   }
}
