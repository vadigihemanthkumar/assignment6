import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();

        double totalExpenses = calculateTotalExpenses(quantity, price);

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double price) {
        double discount = 0.0;

        if (quantity > 50) {
            discount = 0.1;
        } else if (quantity >= 25) {
            discount = 0.05;
        }

        double totalBeforeDiscount = quantity * price;
        double discountAmount = totalBeforeDiscount * discount;
        double totalExpenses = totalBeforeDiscount - discountAmount;

        return totalExpenses;
    }
}
