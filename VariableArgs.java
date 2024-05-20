class Varargs {
    void display(/* int...b */String... a) { // We cannot use more than one variable argument at a time
        System.out.println("The input is \n");
        for (String s : a) {
            System.out.println(s);
        }
    }
}

public class VariableArgs {
    public static void main(String[] args) {
        Varargs v = new Varargs();
        v.display();
        System.out.println("<===========================>");
        v.display("Sachin");
        System.out.println("<===========================>");
        v.display("Sachin ", "Yadav", "is", "learning", "java", ".");
        System.out.println("\n");
    }
}
