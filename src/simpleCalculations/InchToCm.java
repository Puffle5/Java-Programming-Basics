package simpleCalculations;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cm: ");
        double cm = scanner.nextDouble();
        double inch = cm*2.54;
        System.out.println(cm+" centimeters are equal to "+inch+" inches.");
    }
}
