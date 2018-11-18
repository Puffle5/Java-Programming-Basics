package complexCalculations;
import java.util.Scanner;
//Лице на трапец:
public class TrapezoidArea
{
public static void main(String[] arguments) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first base: ");
double firstBase = scanner.nextDouble();
System.out.print("Enter second base: ");
double secondBase = scanner.nextDouble();
System.out.print("Enter height: ");
double height = scanner.nextDouble();
double area = (firstBase + secondBase)*height/2;
System.out.println("The area of the trapezoid is: "+area+".");
}}
