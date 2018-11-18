package complexCalculations;
import java.util.Scanner;
//Лице на правоъгълник в равнината:
public class RectangleArea
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first coordinates: ");
double x1 = Double.valueOf(scanner.nextLine());
double y1 = Double.valueOf(scanner.nextLine());
System.out.println("Enter second coordinates: ");
double x2 = Double.valueOf(scanner.nextLine());
double y2 = Double.valueOf(scanner.nextLine());
double firstSide = Math.abs(x1 - x2);
double secondSide = Math.abs(y1 - y2);
System.out.println("The sides of the rectangle are "+firstSide+" and "+secondSide+".");
double perimeter = 2*(firstSide + secondSide);
double area = firstSide*secondSide;
System.out.println("Perimeter: "+perimeter+".");
System.out.println("Area: "+area+".");
}}
