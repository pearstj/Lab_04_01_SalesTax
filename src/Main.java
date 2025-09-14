//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare constant for sales tax rate
        final double SALES_TAX_RATE = 0.05;

        // Prompt the user to enter the purchase price
        System.out.print("Enter the price of the purchase: $");
        double purchasePrice = scanner.nextDouble();

        // Calculate the sales tax
        double salesTax = purchasePrice * SALES_TAX_RATE;

        // Display the original price and the computed sales tax
        System.out.printf("Purchase Price: $%.2f%n", purchasePrice);
        System.out.printf("Sales Tax (5%%): $%.2f%n", salesTax);

        // Close the scanner
        scanner.close();
    }
}
