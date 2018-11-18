package complexCalculations;
import java.util.Scanner;
//Converting inches to centimeters:
public class InchToCm
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter value in cm: ");
double cm = scanner.nextDouble();
double inch = cm*2.54;
System.out.println(cm+" centimeters are equal to "+inch+" inches.");
}}
