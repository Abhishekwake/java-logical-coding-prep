class Demo {
    public static void main(String[] args) {

        String str = "there is no tomorrow";

        int wordsCount = 0;
        int charCount = 0;

        for(int i =0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                charCount++;
            }
            if(ch != ' ' && ( i==0 || str.charAt(i-1) == ' ')){
                wordsCount++;
            }
        }

        // String[] words = str.split(" ");
        // wordsCount = words.length;

        System.out.println("Words = " + wordsCount);
        System.out.println("Characters ="+ charCount);

    }
}