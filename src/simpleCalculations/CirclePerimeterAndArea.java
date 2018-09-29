package simpleCalculations;
import java.util.Scanner;
public class CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = Double.valueOf(scanner.nextLine());
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius, 2);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);

    }
}



//    Напишете програма, която чете от конзолата число r и
//    пресмята и отпечатва лицето и периметъра на кръг с радиус r.