public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "Helloworld";
        StringBuilder result = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        System.out.println(result.toString());  
    }
}

