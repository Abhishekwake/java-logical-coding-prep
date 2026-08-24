class frequncywithoutrepeating {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4};
        for(int i = 0;i<arr.length;i++){
            boolean already = false;
            for(int j = 0;i<arr.length;j++){
                for(int k =0;k<i;k++){
                    if(arr[k]==arr[i]){
                        already =true;
                        break;
                    }
                }
                if(already){
                   continue; 
                }
            int count = 0;
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
        }
    }
}
