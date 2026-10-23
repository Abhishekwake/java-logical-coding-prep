public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int count = 0;
        int sum = 0;
        while(temp!=0){
            count ++;
            temp/=10;
        }
        temp=num;
        while(temp!=0){
            int d = temp%10;
            sum = sum + (int)Math.pow(d, count);
            temp = temp/10;
        }
        if(sum==num){
            System.out.println("armstrong");
        }else{
            System.out.println("not an armstrong");
        }
    }
}
