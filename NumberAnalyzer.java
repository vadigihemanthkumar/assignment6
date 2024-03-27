import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (or 'done' to finish): ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
                if (num > largest) {
                    largest = num;
                }
                if (num < smallest) {
                    smallest = num;
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    continueInput = false;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'done' to finish.");
                }
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}
