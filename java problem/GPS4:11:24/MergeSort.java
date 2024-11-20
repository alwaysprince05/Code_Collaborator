public class MergeSort {

    public static void divide(int arr[],int low,int high){  
        // base case when low will equal to high then we will have single 
        if(low==high){
            return;
        }
        // calculate mid for division 
        int mid=low+(high-low)/2;
        divide(arr,low,mid);// it will handle the left array
        divide(arr,mid+1,high);// it will handle the right array
        divide(arr,mid+1,high);// this will merge the whole array
        conquer(arr,low,mid,high);
    }
    public static void conquer(int arr[],int low,int mid,int high){

        int temp[]=new int[high-low+1]; // creating a temporary array
        int lp=low;// starting pointer for left array
        int rp=mid+1; // starting pointer for right array
        int tp=0; // starting pointer for temporary array
        while(lp<=mid && rp<=high){ //this loop will run until one array finished 
            if(arr[lp]<arr[rp]){ // comparing the elements and if left value is smaller it will be placed in temporary array
                temp[tp]=arr[lp];
                lp++; // increasing the pointer of temporary array
                tp++; // increasing the pointer of left array
            }
            else{ // if right value is smaller it will insert from right array
                temp[tp]=arr[rp];
                rp++;
                tp++; // increasing the pointer of right array
            }
        }
        // handling the rest of the values remained in either left or right array
        while(lp<=mid){ // handling remaining values in left array
            temp[tp]=arr[lp];
            lp++;
            tp++;    
        }
        while(rp<=high){ // handling remaining values in right array
            temp[tp]=arr[rp];
            rp++;
            tp++;
        }
        int op = low;// starting pointer for original array
        for(int val:temp){ // inserting value from temporary array in original array
            arr[op]=val;
            op++; // increasing the pointer of original array
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,5,2,1,3};
        int low=0;
        int high=arr.length-1;
        System.out.println("before sorting an array: "+java.util.Arrays.toString(arr));
        divide(arr,low,high);
        System.out.println("after sorting an array: "+java.util.Arrays.toString(arr));
    }    
}