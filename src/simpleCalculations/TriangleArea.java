package simpleCalculations;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        double side = Double.valueOf(scanner.nextLine());
        System.out.println("Enter height of triangle: ");
        double height = Double.valueOf(scanner.nextLine());
        double area = side*height/2;
        System.out.printf("Area: %.2f", area);
    }

}
//    Напишете програма, която чете от конзолата страна и
//        височина на триъгълник и пресмята неговото лице.
//        Използвайте формулата за лице на триъгълник: area = a * h / 2.
//        Закръглете резултата до 2 знака след десетичната точка използвайки   “%.2f”.