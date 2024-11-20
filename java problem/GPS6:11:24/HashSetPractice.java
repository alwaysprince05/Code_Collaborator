import java.util.HashSet;
public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
      System.out.println(set);
      System.out.println(set.contains(4));
      System.out.println("lenght of the set"+set.size());
      set.clear();
      System.out.println(set);
    }
}
