public class CheckCubeSum{
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int cubeSum = 0;
        while (num > 0) {
            int digit = num % 10;      
            cubeSum += Math.pow(digit, 3);  
            num /= 10;                 
        }
        if (cubeSum == originalNum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
// public class CheckCubeSum {
//      int n=153;
//      int result=0;
//      int length=String Valueof(n).legth();
//      while(m>0){
//         int temp=m%10;
//         result +=Math.pow(n,length)
//      }
    
// }
