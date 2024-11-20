interface contract{
    abstract public void legacy(); // abstract method
   default public void message(){  // default method use to abstract the method.
        System.out.println("this is legacy interface");
    }
}
class HotelStaff implements contract{
     public void legacy(){
        System.out.println("Welcome sir/mam");
     }
}
public class InterfaceEx {
    public static void main(String args[]) {
        HotelStaff obj= new HotelStaff();
        obj.legacy();
        obj.message();
    }
}
