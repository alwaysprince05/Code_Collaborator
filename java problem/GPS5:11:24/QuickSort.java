import java.util.Arrays;

class QuickSort{
    public static void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;// in recursion brake krne k liye return krte hai.
        }
        int pidx = partition(arr,low,high);// it will return pivot index
        quicksort(arr, low, pidx-1);// left
        quicksort(arr, pidx+1, high);// Right
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int start=low - 1;
        for(int i=low;i<high;i++){
            if(arr[i]<=pivot){
                start++;
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
            }
        }
        start++;
        int temp=arr[high];
        arr[high]=arr[start];
        arr[start]=temp;
        return start;
 }

public static void main(String args[]) {
    int arr[] = {4, 3, 6, 5};
    int low = 0;
    int high = arr.length - 1;
    quicksort(arr, low, high);
    System.out.println(Arrays.toString(arr));
}
}