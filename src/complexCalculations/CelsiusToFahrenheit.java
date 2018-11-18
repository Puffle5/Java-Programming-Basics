package complexCalculations;
import java.util.Scanner;
//Converting Celsius to Fahrenheit:
public class CelsiusToFahrenheit
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Temperature in Celsius: ");
double celsiusTemperature = Double.valueOf(scanner.nextLine());
double fahrenheitTemperature = celsiusTemperature*1.8 + 32;
System.out.printf("Temperature in Fahrenheit: %.2f.", fahrenheitTemperature);
}}
