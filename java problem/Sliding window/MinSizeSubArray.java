class MinSizeSubArray {
 static int MinSubArr(int [] arr,int target){
        int wsum = 0;
        int wsize = Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<arr.length;right++){
            wsum+=arr[right];
            while(target<=wsum){
                if(target==wsum){
                    wsize=Math.min(wsize, right-left+1);
                }
                wsum=wsum-arr[left];
                left++;
            }
        }
        return wsize==Integer.MAX_VALUE?0:wsize;
 }
    
}