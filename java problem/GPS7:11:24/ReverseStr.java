public class ReverseStr {
    public static void main(String[] args) {
        String str="Hello";
        StringBuilder copy=new StringBuilder(str);
        copy.reverse();String res=copy.toString();
        System.out.println(res);
    }
}
