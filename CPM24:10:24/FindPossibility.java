import java.util.HashMap;
public class FindPossibility {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 1, 7};
        int k = 3; 
        boolean result = checkPossibility(arr, k);
        System.out.println(result); 
    }
    public static boolean checkPossibility(int[] arr, int k) {
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>(); 

        for (int i = 0; i < arr.length; i++) {
            if (lastIndexMap.containsKey(arr[i])) {
                int lastIndex = lastIndexMap.get(arr[i]);
                if (Math.abs(i - lastIndex) <= k) {
                    return true; 
                }
            }
            lastIndexMap.put(arr[i], i);
        }
        return false; 
    }
}
