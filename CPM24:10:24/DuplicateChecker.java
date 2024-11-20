import java.util.HashSet;
public class DuplicateChecker {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 0, 5}; 
        boolean hasDuplicates = checkForDuplicates(arr);
        if (hasDuplicates) {
            System.out.println("True: Yes duplicate numbers in the array.");
        } else {
            System.out.println("False: No duplicate numbers in the array.");
        }
    }
    public static boolean checkForDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>(); 
        
        for (int num : arr) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num); 
        }
        return false; 
    }
}
