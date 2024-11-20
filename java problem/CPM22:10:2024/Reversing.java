// class Reversing{
    
//     public int reverse(int x){
//         int reversed=0;
//         while(x!=0){
//             int lastDigit=x%10;
//             x/=10;
//             reversed=reversed*10+lastDigit;
//         }
//         return reversed;
//     }
// }
// class Reversing {
//     public static void main(String[] args) {
//         int x = 123; 
//         int reversed = 0; 
//         int remainder;
//         while (x != 0) {
//             remainder = x % 10; 
//             reversed = reversed * 10 + remainder; 
//             x = x / 10; 
//         }
//         System.out.println("Reversed number: " + reversed);
//     }
// }
class Reversing {
    public static void main(String[] args) {
        int n = 123; 
        int sum = 0;
        int rem; 
        int i = n; 
        while (i > 0) {
            rem = i % 10;  
            sum = sum * 10 + rem;  
            i = i / 10;  
        }

        System.out.println("Reversed number: " + sum);
    }
}
