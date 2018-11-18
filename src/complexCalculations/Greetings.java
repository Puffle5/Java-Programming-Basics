package complexCalculations;
import java.util.Scanner;
//Only my computer speaks to me:
public class Greetings
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Greetings, "+name+"!");
}}
