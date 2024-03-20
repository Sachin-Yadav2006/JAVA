public class Exceptions {
    public static void main(String[] args) {
        int d,a;
        try{//monitor a block of code
            d=0;
            a=42/d;
            System.out.println("No exception occured and division performed successfully");
            System.out.println("The value of a is "+a);
        }
        catch(ArithmeticException e){
            //catch the divide by zero 
            System.out.println("Division by 0");
        }
        System.out.println("After the catch statement:");
    }
}
