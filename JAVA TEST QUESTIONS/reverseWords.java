public class reverseWords {
    public static void main(String[] args) {
         String str = "There is no tommorow";
         String word = "";
         for(int i = str.length()-1 ; i>=0 ; i--){
            char ch = str.charAt(i);
            if(ch!= ' '){
                word = ch + word;
            }else{
                System.out.print(word+" ");
                word = "";
            }
         }
         System.out.println(word);
    }
}
