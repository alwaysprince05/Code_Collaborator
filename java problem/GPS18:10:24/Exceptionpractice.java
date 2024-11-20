class Exceptionpractice {
    public static void main(String[] args) // when we use exception class as a method then we use throws.
        throws ArithmeticException{
try{
    if (5>4){
        throw new ArithmeticException("Custom Exception");
    }
}
        
        // try{
        //     int a=5/0;
        //     System.out.println("No Exception");
        // }
        catch(ArithmeticException e){
            System.out.println("Exception"+e);
        }
        finally{
            System.out.println("Common process");
        }
    }
}
// Exceptionjava.lang.ArithmeticException: / by zero means exception error can't divide by zero.
