// class Factorial{
//     public static void main(String[] args) {
//         int Factorial=1;
//         int n=38;
//         for(int i=n;i>=1;i--){
//         Factorial=Factorial*i;
//         }
//         System.out.println(Factorial);
//     }
// }
// Factorial of 38;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger fact(int n) {
        // base condition
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Result: " + fact(n));
        sc.close();
    }
}
