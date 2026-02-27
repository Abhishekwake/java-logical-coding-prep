class Demo{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("A & B is : " +a +" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("A & B is : " +a +" "+b);
        
    }

}