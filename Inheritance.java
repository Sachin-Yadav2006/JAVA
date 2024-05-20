//Constructors and Blocks are not inherited in the child class when extended
//When we declare the class as final then it cannot be extended by any other class
class A{

    int a=10;   //instance variable 
    final static int b=10;    //static variable
    {
        System.out.println("Instance Block in class A");    //Instance Block
    }
    static{
        System.out.println("Static Block in class A");  //Static Block will directly be executed when the class is loaded i.e. any static things are accessed then it will automatically be printed even if not being called for example we want to print A.b
    }
    A(){
        System.out.println("Default constructor in A");
    }
    void m1(){
        System.out.println("Method in A");
    }
    static void m2(){
        System.out.println("Static method in A");
    }

}

class B extends A{
    void showall(){
        System.out.println(a);  //both instance and static variable can be accessed
        System.out.println(b);  //final variables are also accessed in the sub class or the child class
    }

}
public class Inheritance {
    public static void main(String[] args) {
        //Everything of class A except Blocks and Constructors can be accessed using the objecct of class B
        A ob=new A();
        System.out.println(A.b);
        B b1=new B();
        b1.showall();
        System.out.println(b1.b);
       b1.m1();
       b1.m2();
    }
}
