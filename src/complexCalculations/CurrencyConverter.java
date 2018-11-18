package complexCalculations;
import java.util.Scanner;
//Converting currencies:
public class CurrencyConverter
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter value: ");
double valueCurrency = Double.valueOf(scanner.nextLine());
System.out.print("Input currency: ");
String inputCurrency = scanner.nextLine();
System.out.print("Output currency: ");
String outputCurrency = scanner.nextLine();
double EUR = 1.95583, GBP = 2.53405, USD = 1.79549;
switch (inputCurrency)
{
case "BGN":break;
case "EUR":valueCurrency = valueCurrency*EUR; break;
case "GBP":valueCurrency = valueCurrency*GBP; break;
case "USD":valueCurrency = valueCurrency*USD; break;
}
switch (outputCurrency)
{
case "BGN":break;
case "EUR":valueCurrency = valueCurrency/EUR; break;
case "GBP":valueCurrency = valueCurrency/GBP; break;
case "USD":valueCurrency = valueCurrency/USD; break;
}
System.out.printf("Converted currency: %.2f %s.",valueCurrency,outputCurrency);
}}
