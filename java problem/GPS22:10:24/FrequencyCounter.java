// finding the repeated element inside the array
class FrequencyCounter{
    public static void main(String[] args) {
        int arr[]={1,2,2,4,3,5,7};  // arr1
        int res[]=new int[arr.length+1];  // arr2
        for(int i=0;i<arr.length;i++){
            res[arr[i]]++; // assigning the arr[i]++ bez result is inside the arr and all the element present in i.
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>1){
                System.out.println(i);// returning i bez index is out value
                break;
            }
        }
    }
}