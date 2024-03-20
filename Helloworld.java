public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i=9;
        int b=i++; //first assigned then incremented 
        int c=++i; //first incremented then assigned
        System.out.println("The value of c is "+c);
        System.out.println("The value of b is "+b);
        System.out.println("The value of i is "+i);
        System.out.println(++c);
        String name="Sachin Yadav";
        System.out.println(name.substring(0,12));
        System.out.println(name.equals("Sachin Yadav"));
    }
}