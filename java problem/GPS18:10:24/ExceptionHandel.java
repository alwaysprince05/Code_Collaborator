class ExceptionHandel {
    public static void main(String[] args) {
        try{  // is code have some exception then we use try process.
            // int a=5/0;
            int b=6/2;
        }
        catch(ArithmeticException e){  // withany region any exception will occure catch block will excute. 
            System.out.println("Exception in code");
        }
        finally{
            System.out.println("All sever detached");// whenever we want to perform a final process then we use finally process to detached the server.
        }
        System.out.println("Sever not crashed");
    }
}
