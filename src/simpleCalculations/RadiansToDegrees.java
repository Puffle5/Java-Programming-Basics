package simpleCalculations;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radians: ");
        double radians = Double.valueOf(scanner.nextLine());
        double degrees = Math.round(radians*180/Math.PI);
        System.out.println(radians+" radians are equal to "+degrees+" degrees.");

    }
}
