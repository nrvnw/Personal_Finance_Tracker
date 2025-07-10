package personalfinancetracker;

import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();


    public void addExpense(Expense expense){
        expenses.add(expense);
    }

    public void listExpenses(){
        if (expenses.isEmpty()){
            System.out.print("No records!");
            return;
        }
      for (Expense e: expenses){
          System.out.println(e);
      }
    }

    public double getTotalExpenses(){
        double total = 0.0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public void getByCategory(String category ){

        for (Expense e: expenses) {
        if (e.getCategory().equalsIgnoreCase(category)){
            System.out.println("\n" + e);
            }
        }
    }
}