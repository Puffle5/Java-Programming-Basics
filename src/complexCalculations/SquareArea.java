package complexCalculations;
import java.util.Scanner;
//Лице на квадрат със страна a:
public class SquareArea
{
public static void main(String[] arguments)
{
System.out.print("Enter side a: ");
Scanner scanner = new Scanner(System.in);
double a = scanner.nextDouble();
double area = a*a;
System.out.println("The area of the square is: "+area+".");
}}