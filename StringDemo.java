public class StringDemo {
    public static void main(String[] args) {
        String strob1="First String";
        String strob2="Second string";
        String strob3=strob1;
        System.out.println("Length of strob1: "+strob1.length());
        System.out.println("Char at index 3 in strob1: "+strob1.charAt(3));
        if(strob1.equals(strob2)){
            System.out.println("The strob1 is equal to strob2");
        }
        else{
            System.out.println("strob1!=strob2");
        }
        if(strob1.equals(strob3)){
            System.out.println("The strob1 is equal to strob3");
        }
        else{
            System.out.println("strob1!=strob3");
        }

    }
}
