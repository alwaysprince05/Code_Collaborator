class Capsule{                      // we have a capsule in which we are hiding the property of capsule inside the single unit.
    private int medprice=10;
    private int profit=20;
    private int shellprice=medprice+profit;
    public void getprice(){        // getter function in java of the function when we can axcess the prive property. but set method in java helps to update the function in a private property.
        System.out.println(shellprice);
    }
}
public class EncapsulationPractice {     // inside the class if any property is private we can't access the proprty of class.
    public static void main(String args[]){
        Capsule obj=new Capsule();
        obj.getprice();
       //  System.out.println(obj.medprice);// if any property is private we can't access outside the class.
    }
}
