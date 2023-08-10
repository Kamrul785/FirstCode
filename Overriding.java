package overriding;
class Employee{
     int base = 10000;
     int salary(){
         return base;
     }
 } 
class Manager extends Employee{
    int salary(){
        return base + 30000;
    }
}
class Clerk extends Employee{
    int salary(){
        return base + 10000;
    }
}
public class Overriding {
    static void printsalary(Employee e){
        System.out.println(e.salary());
    }
    public static void main(String[] args) {
        Employee ob1 = new Manager();
        System.out.print("Manager's Salary : ");
        printsalary(ob1);
        Employee ob2 = new Clerk();
        System.out.print("Clerk Salary : ");
        printsalary(ob2);
    }
}
