// public class Number {
//     public static void main(String[] args) {
        
    
// int nums[]={-1,2,3,-5,6,5,8,0,9,-5};
// int count=0;
// int len=nums.length;
// for(int i=0;i<len;i++){
// if(nums[i]<0){
//     count++;
// }
// }
// System.out.println(count);
// }
// }
public class Number {
    public static void main(String[] args) {
        
        int nums[] = {-1, 2, 3, -5, 6, 5, 8, 0, 9, -3};
        int len = nums.length;
        
        System.out.print("Negative numbers inside the array: [");
        boolean first = true;  
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(nums[i]);
                first = false;
            }
        }
        System.out.println("]");
    }
}
