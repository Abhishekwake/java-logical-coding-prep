public class vowels {
    public static void main(String[] args) {
        String str = "aerffervrtu";
        int vowels = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'u' || ch =='o'){
                vowels++;
            }

        }
        System.out.println(vowels);

    }
}
