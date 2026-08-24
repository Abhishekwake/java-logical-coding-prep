import java.util.Scanner;

class Demo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int count = 0;
    int temp = num;
    int sum = 0;
    while (temp!=0) {
        temp = temp/10;
        count = count+1;
    }
    temp = num;
    while(temp!=0){
     int d = temp % 10;
     sum = sum +(int) Math.pow(d,count);
     count = count -1;
     num = num/10;
    }   
    if(sum==num){
        System.out.println("disariums");
    }
    else{
        System.out.println("not a disarium");
    }
}