import java.util.ArrayList;
import java.util.Scanner;
class Friend{
    public static void main(String[] args) {
        ArrayList<String>friends=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your friends name:");
        while(true){
            String name=sc.nextLine();
            if(!name.equals("exit")){
                friends.add(name);
                System.out.println("Enter new friend or type exit to close");
            }
            else{
                break;
            }
        }
        System.out.println(friends);
        int len=friends.size();
        friends.remove(len-1);
        System.out.println(friends);
        System.out.println("my best friend"+friends.get(0));
        System.out.println("i had a little fight with:"+friends.get(0));
        friends.set(0,"nobody");
        System.out.println("now my best friend"+friends.get(0));
        System.out.println("I need 10lakhs");
        System.out.println("now my friends");
        friends.clear();
        System.out.println(friends);
    }
}