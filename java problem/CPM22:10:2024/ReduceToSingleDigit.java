public class ReduceToSingleDigit {
    public static void main(String[] args) {
        int number = 38;
        int result = reduceToSingleDigit(number);
        System.out.println("The single digit of " + number + " is: " + result);
    }
    public static int reduceToSingleDigit(int num) {
        while (num >= 10) {  
            num = sumOfDigits(num);
        }
        return num;  
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  
            num /= 10;  
        }
        return sum;  
    }
}


