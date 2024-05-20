//3. Write a code to implement variable arguments example.

class variableargs{
    void display(String...s){
        System.out.println("The Input strings are : ");
        for(String a:s){
            System.out.println(a);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println();
    }
}
public class VariableArgumentstest {
    public static void main(String[] args) {
        variableargs v=new variableargs();
        v.display("I am ","giving");
        v.display("Object","Oriented","Programming");
    } 

}
