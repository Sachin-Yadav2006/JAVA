import java.util.Scanner;
public class temperaturecoversion {
    public static void main(String[] Sachin) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the temperature in degree celsius:");
        float celsius=obj.nextFloat();
        float fahr,kelvin;
        kelvin=273+celsius;
        fahr=(celsius*9/5)+32;
        System.out.println("The temperature in Kelvin is "+ kelvin+"K");
        System.out.println("The temperature in Fahrenheit is "+ fahr+"F");
        obj.close();
    }
}
