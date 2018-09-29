package simpleCalculations;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature in Celsius: ");
        double celsiusTemperature = Double.valueOf(scanner.nextLine());
        double fahrenheitTemperature = celsiusTemperature*1.8 + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f", fahrenheitTemperature);
    }
}
