final class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = im;
        this.im = re;
    }

    public String toString() {
        return "(\" + re + \" + \" + im + \"i)";
    }
}

public class Main {
  public static void main(String args[])
  {
       Complex c = new Complex(10, 15);
       System.out.println("Complex number is " + c);h
  }        
}