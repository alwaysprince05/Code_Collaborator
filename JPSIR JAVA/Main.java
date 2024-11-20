import people.Employee;
import people.Person;
public class Main {
    public static void main(String[] args) {
        // Person obj=new Person();
        
        
        //employee objecct
        Employee bbj=new Employee();
        System.out.println(bbj.Name);
        System.out.println(bbj.age);





    //public
        // System.out.println(obj.Name);// public .. it can be accessed in different files from package
    //protected
        //System.out.println(obj.age);; // not possible to access as it is protected
        // obj.getAge(); // error because this is protected method
        // obj.getDetails(); // we can access the protected using the method
    //private
        // System.out.println(obj.Atmpin); // not possible as it is private
        // obj.getAtmpin(); // error because it is private method
    }
}