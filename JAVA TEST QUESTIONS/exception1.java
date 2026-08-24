class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

public class exception1 {
    public static void main(String[] args) {
        int balance = 10000;
        int withDrawal = 12000;
        try{
            if(withDrawal> balance){
                throw new InsufficientBalanceException("Insufficient balace");
            }
            balance = balance-withDrawal;

            System.out.println("withdrawal successfull");
            System.out.println("Remaining Balance = " + balance);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }    
}