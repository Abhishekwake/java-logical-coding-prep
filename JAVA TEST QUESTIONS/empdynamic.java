class Employee {
    String name;
    double basicSalary;
    Employee(String name , double basicSalary){
        this.name = name;
        this .basicSalary = basicSalary;
    } 
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class PermanentEmployee extends Employee{
    PermanentEmployee(String name,double salary){
        super(name, salary);
    }
    @Override
    void calculateSalary(){
        double salary = basicSalary + (20.0/100*basicSalary)+ (10.0/100*basicSalary);
        System.out.println("Employee name " +name);
        System.out.println("permanent employee salary" + salary);
    }
}
class ContractEmployee extends Employee{
    ContractEmployee(String name,double salary){
        super(name, salary);
    }

    @Override 
    void calculateSalary(){
        double salary = basicSalary + (5.0/100*basicSalary);
        System.out.println("Employee name " +name);
        System.out.println("contract emp sal " +salary);
    }

}
public class empdynamic {
 public static void main(String[] args) {
    Employee e;
    e = new PermanentEmployee("Rahul", 50000);
    e.calculateSalary();
    e = new ContractEmployee("Abhishek", 50000);
    e.calculateSalary();
 }
}
// }
// Dynamic Method Dispatch — Employee

// Question:
// Create an Employee class with calculateSalary(). Create PermanentEmployee and ContractEmployee subclasses by overriding the method.

// Permanent Employee: Basic Salary + 20% incentive + 10% bonus
// Contract Employee: Basic Salary + 5% incentive
// Use Dynamic Method Dispatch to calculate and display both salaries.