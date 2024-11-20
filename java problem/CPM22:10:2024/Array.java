public class Array {
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 13, -5, 1, 2};
        int mul = 1;
        for(int i : arr) {
            mul *= i;
        }
        if(mul > 0) {
            System.out.println("positive");
        } 
        else if(mul == 0) {
            System.out.println("zero");
        } 
        else {
            System.out.println("negative");
        }
    }
}

