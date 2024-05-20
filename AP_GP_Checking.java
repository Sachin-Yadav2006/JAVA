//Taking a series of numbers as input and finding whether they form an AP or GP

import java.util.ArrayList;
import java.util.Scanner;

public class AP_GP_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers of the series:");
        System.out.println("Type Exit to finish taking inputs");
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            numbers.add(number);
        }

        // Checking for Arithmetic Progression
        int flag = 1;
        int difference = numbers.get(1) - numbers.get(0);
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i + 1) - numbers.get(i) != difference) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The entered sequence is a Arithmetic Progression.");
        } else {
            flag = 1;
            // Checking for Geometric Progression
            int ratio = numbers.get(1) / numbers.get(0);
            for (int i = 1; i < numbers.size() - 1; i++) {
                if (ratio != numbers.get(i + 1) / numbers.get(i)) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("The entered sequence is a Geometric Progression");
            } else {
                System.out.println(
                        "The entered sequence is neither a Geometric Progression nor an Arithmetic Progression.");
            }
        }
    }
}
