public class BinarySearch {
    static int bsearch(int arr[],int target){
        int Left=0;
        int Right=arr.length-1;
        while(Left<=Right){
            int mid=(int)(Left+Right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                Left=mid+1;
            }
            else{
                Right=mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6};
        int target=5;
        int res=bsearch(data, target);
        System.out.println(res);
    }
}
