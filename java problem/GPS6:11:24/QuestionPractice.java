// create a arraylist of natural number and then create a method to return arraylist of even no.
// Question1)
// import java.util.ArrayList;

// public class QuestionPractice {
//     public static ArrayList<Integer> even(ArrayList<Integer> list) {
//         ArrayList<Integer> evenlist = new ArrayList<>();
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) % 2 == 0) {
//                 evenlist.add(list.get(i));
//             }
//         }
//         return evenlist; // Added return statement
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> natural = new ArrayList<>();
//         for (int i = 1; i <= 20; i++) {
//             natural.add(i);
//         }
//         System.out.println("List of natural numbers: " + natural);
        
//         ArrayList<Integer> evennum = even(natural);
//         System.out.println("List of even numbers: " + evennum);
//     }
// }
// An array name is given["karan","raj","mohit","raj","karan","raj"] now find the most occured name.
// import java.util.*;
// public class QuestionPractice {
//     public static void main(String[] args) {
//         String names[]={"karan","raj","mohit","raj","karan","raj"};// given array
//         String name="";// assume name is maximum occured name
//         HashMap<String,Integer>map=new HashMap<>();// creating hashmap to store values
//         for(String i:names){// iterating map with for each loop
//             map.put(i,map.getOrDefault(i, 0)+1);// step1: i=karan {karan=1}
//             // step2: i=raj {karan=1,raj=1}
//             // step 3: i=mohit {karan=1,raj=1,mohit=1}
//             // step 4: i=raj fetched value of raj which is 1 now{karan=1,raj=1+1,mohit=1}
//             // step 5: i=karan fetched value of raj which is 1 now{karan=1+1,raj=2,mohit=1}
//                // step 6: i=karan fetched value of raj which is 1 now{karan=1+1,raj=2+1,mohit=1}
//                // resultant map:{karan=2,raj=3,mohit=1}
//         }
//         for(String key:map.keySet()){// ["karan","raj","mohit"]
//             if(map.get(key)>map.getOrDefault(name, 0)){
//                 name=key;
//                 // step1: key=karan, name="" if(2>0) condition is true then name will update => name=karan
//                 // step2:key=raj,name=karan if(3,2)condition is true then name will update =>name=raj
//                 // step3: key=mohit,name=raj if(1>3)condition is false then name will wont't be update
//                 // reached end of the array
//                 // finally the value is raj.
//             }
//         }
//         System.out.println(name);
//     }
// }// raj
// question3) nums=[1,2,1,3,4,5,-1,-3,2,1,4] return array of unique element.
import java.util.HashSet;
import java.util.Arrays;
public class QuestionPractice {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,2,4,1,3};// given array
        HashSet<Integer>unique=new HashSet<>();// created hasset to store a unique elemnt
        for(int i:arr){
            unique.add(i);// unique=[1,2,3,4] but it is hashset
        }
        int res[]=new int[unique.size()];// creating a array of size unique(hasset)
        int ip=0;// creating pointer to insert values in res array
        for(int i:unique){
            res[ip]=i;
            ip++;
            // step 1: i=1, first ip was 0 and then after increament ip=1
            // res=[1,0,0,0]
            //  step 2: i=1, ip=1 now res=[1,2,0,0] then ip=2
            //  step 3: i=1, ip=1 now res=[1,2,0,0] then ip=3
            //  step 4: i=1, ip=1 now res=[1,2,0,0] then ip=4
        }
        System.out.println(Arrays.toString(res));
    }
}