public class firstprogram {
    public static void main(String[] args) {
        int bar=1;
        if (bar==1) {
            int a=90;
            bar=2;          //cannot redeclare the bar variable
        }
        else{
        int a=89;  //a inside the if block is not accessible here
        }
       System.out.println("The value of the bar variable is "+bar);
      // System.out.println("The value of a is "+a);    //a's scope is not here
    }
}
