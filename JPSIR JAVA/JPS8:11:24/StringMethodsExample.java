public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "Hello, Java Programming!";
        String anotherText = "hello, java programming!";
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));
        System.out.println("Ends with 'Programming!': " + text.endsWith("Programming!"));
        System.out.println("Index of 'Java': " + text.indexOf("Java")); 
        System.out.println("Last index of 'a': " + text.lastIndexOf("a")); 
        String concatenated = text.concat(" Welcome!");
        System.out.println("Concatenated String: " + concatenated); 
        System.out.println("Equals 'hello, java programming!': " + text.equals(anotherText)); 
        System.out.println("EqualsIgnoreCase 'hello, java programming!': " + text.equalsIgnoreCase(anotherText)); 
    }
}
