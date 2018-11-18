package complexCalculations;
import java.util.Scanner;
//Converting USD to BGN:
public class USDtoBGN
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter value in USD: ");
double valueUSD = Double.valueOf(scanner.nextLine());
double valueBGN = valueUSD*1.79549;
System.out.printf("Value in BGN: %.2f.", valueBGN);
}}
