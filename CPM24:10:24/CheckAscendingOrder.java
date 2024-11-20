public class CheckAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 6};
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
                break;  
            }
        }
        if (isAscending) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


