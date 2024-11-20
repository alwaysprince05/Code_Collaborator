class Parent{
    String property="5cr";
}
class Child extends Parent{
    String ChildProperty=property;
}
public class InheritancePractice {  // oops concept.
    public static void main(String[] args) {
        Child cd=new Child();
        System.out.println(cd.ChildProperty);
        System.out.println(cd.property);
    }
}
