// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         String[] words = str.split(" ");
//         String lastWord = words[words.length - 1];
//         System.out.println("Length of last word: " + lastWord.length());
//     }
// }
public class Main {
    public static void main(String[] args) {
        String s = "Hello_world";
        int counter = 0;
        boolean wordStarted = false; 

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '_') { 
                counter++;
                wordStarted = true; 
            } 
            else if (wordStarted) { 
                break;
            }
        }

        System.out.println("The length of the last word is: " + counter);
    }
}

    
