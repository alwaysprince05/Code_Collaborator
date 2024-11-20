public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String lastWord = words[words.length - 1];
        System.out.println("Length of last word: " + lastWord.length());
    }
}

