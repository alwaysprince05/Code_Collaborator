// public class Powering {
//     public static void main(String[] args) {
//         double x = 2.000;
//         int m = 10;
//         double result = Math.pow(x, m);
//         System.out.println("Result of " + x + " to the power " + m + " is: " + result);
//     }
// }
// public class Powering {
//     public static void main(String[] args) {
//         double x = 3.000;
//         int m = 3;
//         double result = 1;
        
//         for (int i = 0; i < m; i++) {
//             result *= x;
//         }
        
//         System.out.println("Result of " + x + " to the power " + m + " is: " + result);
//     }
// }
public class Powering
 {

    public static boolean ispowerofthree(int m)
     {
        if (m<=0)
        {
            return false;
        }
        while (m%3==0) {
            m/=3;
        }
        return m==1;
    }
    public static void main(String[] args)
     {
        System.out.println(ispowerofthree(27));
    }
}
