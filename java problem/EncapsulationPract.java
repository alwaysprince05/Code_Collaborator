 package oops;
class capsule{
     int medprice=10;
    private int profit=20;
    private int sprice=medprice+profit;
    public void getprice(){
        System.out.println(sprice);
    }
}
public class EncapsulationPract {
    public static void main(String[] args){
        Capsule obj=new Capsule();
        obj.getprice();
        System.out.println(obj.medprice);  
    }
}
