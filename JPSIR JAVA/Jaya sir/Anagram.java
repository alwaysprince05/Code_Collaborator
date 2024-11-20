import java.util.Arrays;
class Anagram {
    public static boolean find(String str1, String str2){
        if(str1.length()=str2.length()){
            return false;
        }
        int[] frequency=new int[26];
        System.out.println(Arrays.toSting(frequency));
    }
  
  
      public static void main(String[] args) {
          String str1='listen';
          String str2='silent';
  
          find(str1,str2)
      }
  }