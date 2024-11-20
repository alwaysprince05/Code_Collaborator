class Parent{
    public void mul(int a,int b) {
        System.out.println("This is multiplication:"+(a*b));
    }
}
class Child extends Parent{
    public void mul(int a,int b){
        System.out.println("multiplication"+(a*b));
    }
}
public class PolymorphismEx2 {
    // method overloadding
    static void add(float a,int b){
        System.out.println("Sum:"+(a+b));
    }
    public static void main(String args[]){
        child obj=new obj();
        obj.mul(2,3);
    }
}
