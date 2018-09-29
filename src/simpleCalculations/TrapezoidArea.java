package simpleCalculations;
import java.util.Scanner;
public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first base: ");
        double firstBase = scanner.nextDouble();
        System.out.print("Enter second base: ");
        double secondBase = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double area = (firstBase + secondBase)*height/2;
        System.out.println("The area of the trapezoid is: "+area);
    }
}
//    Напишете програма, която чете от конзолата три числа b1, b2 и h и
//        пресмята лицето на трапец с
//    основи b1 и b2 и височина h. Формулата за лице на трапец е (b1 + b2) * h / 2.