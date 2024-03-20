package Pack;
import Pack.Mypack.*;

public class Mentor extends student {
    protected void  mentpro(){
        System.out.println("Defined protected in Mentor");
    }
    public void mentpub(){
        System.out.println("Defined public in Mentor");
    }
    void mentdef(){
        System.out.println("Defined default in Mentor");
    }
    private void mentpri(){
        System.out.println("Defined private in Mentor.");
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.stupub();
        // s1.stupro();
        // s1.studef();
        // s1.stupri();
        Mentor m1= new Mentor();
        m1.stupro();
        m1.stupub();
        // m1.studef();     would give error as default can only be accessed in same class or same package
        m1.mentdef();
        m1.mentpri();
        m1.mentpro();
        m1.mentpub();

    }
}
