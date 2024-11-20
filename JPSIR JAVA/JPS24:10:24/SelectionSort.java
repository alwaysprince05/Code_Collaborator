import java.util.Arrays;
public class SelectionSort {
    public static void selection(int[] a) 
    {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            // swap a[i] and a[min_index]
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={5,15,76,13,32};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
}

