class Outer{
    int outer_x=100;
    void test(){
       // System.out.println("Inner x is "+ inner_x);    Cannot access the variable inside the nested class in the outer class
        Inner inner =new Inner();
        inner.Display();
    }
    class Inner{
        static int inner_x=10;
        void Display(){
            System.out.println("Display outer x: "+ outer_x);
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
    }
}
