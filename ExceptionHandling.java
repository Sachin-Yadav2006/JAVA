public class ExceptionHandling {
    public static void main(String[] args){
        int a,b;
        a=10;
        b=0;
        int c;
        try{
            c=a/b;
            System.out.println("Division performed successfully");
            System.out.println("The quotient obtained when a is divided by b is "+c);
            //return;
            //System.out.println("After return statement in the try block");
            //System.exit(0);
        }
        //We can't use catch expression for an exception type which is never thrown in the try block
        // catch(ClassNotFoundException e){
        //     System.out.println("<------------------->");
        //     //Division by zero
        //     System.out.println("The denominator of the division to be performed is 0");
        // }
        catch(ArithmeticException e){
            System.out.println("<------------------->");
            //Division by zero
            System.out.println("The denominator of the division to be performed is 0");
            //return;
            //System.out.println("Something");
            System.exit(0);
        }
        finally{
            System.out.println("<------------------------->");
            System.out.println("You are in the finally block");
            System.out.println("Thanks for running the code");
            //return;
           // System.out.println("After the return statement in the finally block");

        }
        System.out.println("<--------------------------------------->");
        System.out.println("Out of the try, catch and the finally block");
    }
}


//When the catch block is removed and error occurred in the try block then the finally block is executed first then a error is shown for the try block

//Code executed sequentially when no error occured in the try block and the catch block is removed

//When both the finally block and catch block is removed and try alone is run then error occurs even if there is no error in the try blok

//When other types  of exception name is given in the catch block which never occur in try block then an error is raised

//We cannot return a value from a void main function and also we cannot use non void main function

//When an exception is written in catch block which is not going to occur like ArrayindexoutofBoundException then if the error does not occured then the code is executed properly

//If there is catch block and the exception type which occured in the try block is not handled in the catch block or any other exception type is handled in the catch block then first the finally block content is executed then the exception is shown

//We can use multiple catch block with a try block

//If we use exit function in the try block and the error occurs in the try block then the control does not reaches till exit function in the try block and it transfers to catch block and then finally block if proper catch block is used and then goes to any statement out of these blocks.

//when no error occurs in the try block and the exit function is used in the try block then the control returns from the try block only and the finally or any statement out of these blocks are not executed. 

//When we use exit function in the catch block and no error occurs in the try block then both try and finally block is executed.

//If the exit function is used in the catch block and  error occurs in the try block then only catch block is executed and the finally block is not executed.

//If we return void from the try block and error is there in the try block then catch block is executed , finally block is executed and any statement out of these blocks are also executed.

//If we return void from the try block and no error is there in the try block then try block is executed and finally block is executed and any statements out of these blocks are not executed.

//If we write any statement after return statement in the try block,catch block or finally block then it gives error irrespectives of if there is error in the try block or not.

//If we use return in the catch block and error is there in the try block then only the catch block and the finally block is executed and any statement out of these blocks are not executed.

//If we use return in the finally block and write any statement out of these blocks then it gives error irrespective of the error in the try block.

//If we use return in the finally block and do not write any statement out of these blocks and there is error in the try block then catch block is executed and then finally block is executed.

//When we use exit function no other statements after it are being executed while when we use return function then finally block is executed.   