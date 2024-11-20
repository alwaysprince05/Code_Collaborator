abstract class StrictParent{
    abstract public void language(); // abstract method
    public void message(){   // concrete method bez it has body.
        System.out.println("I am concrete Method");
    }
    public void getmess(){
        this.message();
    }
    public void greeting(){
        System.out.println("Namaste");
    }
}
class ScaredChild{
    public void language(){
        System.out.println("Hindi");
    }
    public void plan(){
        System.out.println("Will play with friend");
    }
    @Override
    public void greeting(){
        System.out.println("Hello");
    }
}
public class AbstractionEx {
    public static void main(String args[]) {
        ScaredChild obj=new ScaredChild();
        obj.language();
        obj.plan();
        obj.message();
        obj.greeting();
    }
}
