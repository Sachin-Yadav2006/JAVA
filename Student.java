class Mentor{
    void disp(){
        System.out.println("Starter Here");
    }
}
class Student{
    int id;
    String name;
    public static void main(String[] args) {
        Student s1=new Student();
        Mentor m1=new Mentor();
        s1.id=1234;
        s1.name="test";
        System.out.println(s1.id);
        System.out.println(s1.name);
        m1.disp();
    }
}