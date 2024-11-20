 class LinearSearch {
    static int lSearch(int[] arr,int target){
        int result=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return result;

    }
       public static void main(String[] args) {
        int [] data={2,3,1,5,4};
        int target=5;
        int res=lSearch(data,target);
        System.out.println(res);
       }
    
}