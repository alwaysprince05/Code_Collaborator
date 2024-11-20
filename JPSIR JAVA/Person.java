package people;
public class Person {
    public String Name="Nitish";
    protected int age=19;
    private String Atmpin="1245";
     public void getName(){
        System.out.println("the name is "+Name );
     }
     protected void getAge(){
        System.out.println("age is" +age );
     }
     private void getAtmpin(){
        System.out.println("the pin is  "+Atmpin );
     }
     
     public void getDetails(){
      System.out.println("the name is "+Name );
      System.out.println("age is" +age );
      System.out.println("the pin is  "+Atmpin );
     }
}