import java.util.Arrays; 

class BubbleSort {
    static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int[] arr = {2, 3, 1, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
