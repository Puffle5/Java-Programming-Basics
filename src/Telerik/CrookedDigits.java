package Telerik;

import java.util.Scanner;

public class CrookedDigits

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int result = Integer.valueOf(scanner.nextLine());
        int remainder = result%10;
        System.out.println(result);
        System.out.println(remainder);
    }
}
