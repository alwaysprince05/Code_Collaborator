abstract class Parent{
     abstract public void language(); // Abstract method
     public void message(){
          System.out.println("I am Concrete method");
     } 
    
}
class child extends Parent{
     public void language(){
          System.out.println("English");
     }
}
public class AbstractNotes{
     public static void main(String[] args) {
          
               child obj=new child();
               obj.language();
               obj.message();
          }
     }







