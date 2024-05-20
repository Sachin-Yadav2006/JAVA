class sum{
    int a;
    int b;
    sum(int c,int d){
        a=c;
        b=d;
    }
    void result(){
        System.out.println(a+b);
    }
}
public class Temp {
   public static void main(String[] args) {
    sum A=new sum(12, 15);
    System.out.println("Sum is : "+A);
   } 
}
