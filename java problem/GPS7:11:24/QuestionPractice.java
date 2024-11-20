// create a string which stores name of a person and creatr a method which adds last name in original string.
// Q2) write a java program to reverse a string
public class QuestionPractice {
   
    static String fullName(String fName,String lName){
        return fName+lName;
    }
    public static void main(String[] args) {
        String fName="karan";
        String lName="kumar";
        String fullName=fullName(fName,lName);
        System.out.println(fullName);
    }
    
      
}
