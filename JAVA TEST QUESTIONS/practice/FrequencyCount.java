package practice;

public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {5, 8, 5, 2, 8, 8, 2};
        for(int i = 0;i<arr.length;i++){
           boolean alreadyCounted = false;
           for(int k = 0;k < i;k++){
            if(arr[i] == arr[k]){
                alreadyCounted = true;
                break;
            }
           }
           //skip if already counted
           if(alreadyCounted){
            continue;
           }
           int count=1;
           for(int j = i+1; j<arr.length;j++){
             if(arr[i]==arr[j]){
                count++;
             }
           }
           System.out.println(arr[i] +" "+ count);
        }
        
    }
}
