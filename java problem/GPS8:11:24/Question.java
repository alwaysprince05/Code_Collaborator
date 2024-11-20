// write a java program to find most frequent character in a String ex-str=abcdaabc output:a. String will only have lowercase Alphabate.

// import java.util.Arrays;

// class Question {
//     public static void main(String[] args) {
//         String str = "abcdaabc";
//         int freq[] = new int[26]; // Array for frequencies of each letter
//         char alphabet[] = new char[26]; // Character array for letters a-z
//         int tp = 0;
        
//         for (char i = 'a'; i <= 'z'; i++) {
//             alphabet[tp] = i;
//             tp++;
//         }

// for (char i = 'a'; i <= 'z'; i++) {
//                alphabet[tp] = i;
//                 tp++;
//     
//     }
    

//         int max = freq[0];
//         int idx = 0;
//         for (int i = 1; i < freq.length; i++) {
//             if (freq[i] > max) {
//                 max = freq[i];
//                 idx = i;
//             }
//         }
        
//         System.out.println(alphabet[idx]); // Output the character with highest frequency
//     }
// }
// Find out the number of vowels and consonants in a String.leetcode.
class Question{
    public static void main(String[] args) {
        String str="leetcode";
        int freq[]=new int[26];
        char alphabet=new char[26];
        int tp=0;
        for (char i = 'a'; i <= 'z'; i++) {
         alphabet[tp] = i;
         tp++;
        }
            
    }
}
