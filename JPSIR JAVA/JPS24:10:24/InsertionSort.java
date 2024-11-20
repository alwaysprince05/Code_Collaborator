import java.util.Arrays;
public class InsertionSort
{
    public static void Insertion(int[] a)
    {
        int n=a.length;
    for(int i=1;i<n;i++){
        int key=a[i];
        int j=i-1;
        while(j>=0 && key<a[j])
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
}
public static void main(String[] args) {
    int[] arr={22,38,5,10,16};
    Insertion(arr);
    System.out.println(Arrays.toString(arr));
}
}