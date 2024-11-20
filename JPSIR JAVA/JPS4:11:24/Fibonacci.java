// public class Fibonacci {
//     public static void main(String[] args) {
//         int f = 0; 
//         int s = 1;  

//         System.out.println("Fibonacci Series up to 5 terms:");
//         for (int i = 0; i < 5; i++) {
//             System.out.println(f);
//             int next = f + s;
//             f = s;
//             s = next;
//         }
//     }
// }
// BY recursion method
public class Fibonacci{
    public static int fib(int n){
      if(n<=1){
        return n;
      }
      return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            System.out.println(fib(i));
        }
    }
}