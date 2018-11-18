package complexCalculations;
import java.util.Scanner;
//Converting radians to degrees:
public class RadiansToDegrees
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Radians: ");
double radians = Double.valueOf(scanner.nextLine());
double degrees = Math.round(radians*180/Math.PI);
System.out.println(radians+" radians are equal to "+degrees+" degrees.");
}}
