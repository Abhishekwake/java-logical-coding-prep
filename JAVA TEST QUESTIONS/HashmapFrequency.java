import java.util.HashMap;

class Demo {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 3, 3, 2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
       // Go through all unique numbers in the HashMap
        for (int num : map.keySet()) {

            // Print number and its frequency
            System.out.println(num + " - " + map.get(num));
        }
    }
}