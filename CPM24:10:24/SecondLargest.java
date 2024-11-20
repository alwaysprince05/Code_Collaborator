public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7,8,9,10,11}; 
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest; 
                firstLargest = arr[i]; 
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i]; 
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

