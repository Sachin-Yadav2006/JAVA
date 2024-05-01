public class exception_handling {
   public static void main(String[] args) {
    try{
        int i,sum;
        sum=10;
        for(i=-1;i<3;++i){
            sum=sum/i;
        }
    }
    catch (ArithmeticException e){
        System.out.println("0");
    }
    System.out.println(sum);
   } 
}
