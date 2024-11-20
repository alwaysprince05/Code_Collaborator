public class PolymorphismEx {
    // compile time polymorphism.
    public static void add(int a,int b){
        System.out.println("This is sum:"+(a+b));
    }
    // Method overloadding
    public static void add(int a,int b,int c){
        System.out.println("Sum"+(a+b+c));
    }
    public static void main(String[] args) {
        add(2,3);
        add(2,5,4);
    }
}
