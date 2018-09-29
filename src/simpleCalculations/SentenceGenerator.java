package simpleCalculations;
import java.util.Scanner;
public class SentenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println("Where are you from?");
        String town = scanner.nextLine();
        System.out.println("You are "+firstName+" "+lastName+", a "+age+"-years old person from "+town+".");
    }
}
//    Напишете Java програма, която прочита от конзолата име, фамилия,
//        възраст и град и печата съобщение от следния вид:
//        “You are <firstName> <lastName>, a <age>-years old person from <town>”.