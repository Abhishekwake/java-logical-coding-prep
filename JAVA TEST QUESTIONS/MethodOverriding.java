
// this is a runtime polymorphism / method overriding question using inheritance
class Vehical {
    //  cannot be like in overloadingThe parameter list must be the same for overriding
    void runVehicalPrice(int days){
        System.out.println("vehical price");
    }
}
class Car extends Vehical {
    @Override
    void runVehicalPrice(int days){
        int price = days *1500;
       System.out.println("Car =" + price);
    }
}
class Bike extends Vehical {
    @Override
    void runVehicalPrice(int days){
        int price = days*400;
        System.out.println("Bike="+ price);
    }
}

public class MethodOverriding {
 public static void main(String[] args) {
    Vehical car = new Car();
    Vehical bike = new Bike(); 
    // Parent reference → Child object

    car.runVehicalPrice(3);
    bike.runVehicalPrice(3);
 }   
}
