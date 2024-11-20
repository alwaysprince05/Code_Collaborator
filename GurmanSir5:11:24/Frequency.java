public class Frequency {
    public static void main(String[] args) {
        int arr[]={100,1,2,3,4,100,6,2};
        int res[]=new int[101];
        for(int i=0;i<arr.length;i++){
            res[arr[i]]++;
        }
        for(int j =0;j<res.length;j++){
            if(res[j]>1){
                System.out.println(j);
            }
        }
    }
}