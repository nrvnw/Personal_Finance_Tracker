import java.util.Scanner;

public class ExpenseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n(1) Add Expense: ");
            System.out.println("(2) List Expenses: ");
            System.out.println("(3) Get Total Expenses: ");
            System.out.println("(4) List By Category");
            System.out.println("(5) Exit");
            System.out.print("Choice: ");

            // Read the input as a string
            String input = scanner.nextLine();

            try {
                // Try to parse the string into an integer
                int choice = Integer.parseInt(input);

                if (choice == 1) {
                    System.out.print("\nCategory: ");
                    String category = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    System.out.print("Date: ");
                    String date = scanner.nextLine();


                    manager.addExpense(new Expense(category, description, amount, date));
                    System.out.print("\nExpense added!");
                } else if (choice == 2) {
                    manager.listExpenses();
                    scanner.nextLine();
                } else if (choice == 3) {
                    double result = manager.getTotalExpenses();
                    System.out.print("Total: " + result);

                    scanner.nextLine();
                } else if (choice == 4) {
                    System.out.print("Enter Category: ");
                    String cat = scanner.nextLine();

                    manager.getByCategory(cat);


                } else if (choice == 5) {
                    break;
                } else {
                    System.out.println("\nInvalid input! Please choose a valid option.");
                }

            } catch (NumberFormatException e) {
                // Catch the exception and prompt the user again
                System.out.println("\nInvalid input! Please enter a number.");
            }
        }

        scanner.close();
    }
}
