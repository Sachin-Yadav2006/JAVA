public class SwappingNumbers {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        System.out.println("The values of a and b are "+a+"  "+b+" respectively");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("The values of a and b are "+a+"  "+b+" respectively");
    }
}
