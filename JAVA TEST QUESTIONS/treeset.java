import java.util.TreeSet;
// Comparable tells TreeSet how to sort Students
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student s){
     return this.marks - s.marks;
    }
    public String toString(){
        return "(" + name + " , "+ marks +")";
    }
}
class Demo { 
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();  
        set.add(new Student("Abishek", 100));
        set.add(new Student("Shubham", 28));
        set.add(new Student("Tushar", 12)); 
        
        for(Student s : set) {
            System.out.println(s);
        }
    }
}

