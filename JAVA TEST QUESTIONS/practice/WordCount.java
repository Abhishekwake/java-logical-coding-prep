package practice;

public class WordCount {
    public static void main(String[] args) {
        String str = "There is no tommorow";
        int charCount = 0;
        int wordsCount = 0;
        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                charCount++;
            }
            if(ch != ' ' && ( i == 0 || str.charAt(i-1) == ' ' ) ){   
                wordsCount++;
            }
        }
                    System.out.println("Char count is " +charCount);
            System.out.println("words count is " + wordsCount);
    }
}
