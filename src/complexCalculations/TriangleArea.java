package complexCalculations;
import java.util.Scanner;
//Лице на триъгълник:
public class TriangleArea
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter side: ");
double side = Double.valueOf(scanner.nextLine());
System.out.print("Enter height: ");
double height = Double.valueOf(scanner.nextLine());
double area = side*height/2;
System.out.printf("Area: %.2f.", area);
}}
