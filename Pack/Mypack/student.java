package Pack.Mypack;
public class student{
    protected void stupro(){
        System.out.println("Defined protected in Student");
    }
    public void stupub(){
        System.out.println("Defined public in Student");
    }
    void studef(){
        System.out.println("Defined default in Student");
    }
    private void stupri(){
        System.out.println("Defined private in Student.");
    }
    public static void main(String[] args) {
        student s1= new student();
        s1.stupro();
        s1.stupub();
        s1.studef();
        s1.stupri();
    }
    
}


