class A {
    void callme() {
        System.out.println("Inside A's callme method:");
    }
}

class B extends A {
    // override callme
    void callme() {
        System.out.println("Inside B's callme method:");
    }
}

class C extends A {
    void callme() {
        System.out.println("Inside C's callme method:");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r; // Obtain a reference of type A Similar to int A where A is a variable of type A
             // . Here r is a variable of type class A
        // B r; //We cannot do so because A is extended by the other while when we
        // define B's type we cannot access A
        r = a; // r refers to A object
        r.callme(); // A's version of callme
        r = b;// r refers to B object
        r.callme(); // B's version of callme
        r = c; // r refers to a C object
        r.callme();// C's version of callme
        // b.callme1();
    }
}
