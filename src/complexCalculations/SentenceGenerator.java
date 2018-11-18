package complexCalculations;
import java.util.Scanner;
//Enter first/last name, age and city for a playful experience:
public class SentenceGenerator
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first name: ");
String firstName = scanner.nextLine();
System.out.print("Enter last name: ");
String lastName = scanner.nextLine();
System.out.print("Enter age: ");
int age = Integer.valueOf(scanner.nextLine());
System.out.println("Which city are you from?");
String city = scanner.nextLine();
System.out.println("You are "+firstName+" "+lastName+", a "+age+"-year old person from "+city+".");
}}
