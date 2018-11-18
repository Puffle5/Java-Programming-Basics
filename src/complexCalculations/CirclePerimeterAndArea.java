package complexCalculations;
import java.util.Scanner;
//Обиколка и лице на кръг:
public class CirclePerimeterAndArea
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter radius: ");
double radius = Double.valueOf(scanner.nextLine());
double perimeter = 2*Math.PI*radius;
double area = Math.PI*Math.pow(radius, 2);
System.out.println("Circle perimeter: "+perimeter+".");
System.out.println("Circle area: "+area+".");
}}



