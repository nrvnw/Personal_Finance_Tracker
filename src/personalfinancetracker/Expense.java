package personalfinancetracker;

public class Expense {
  private String category;
  private String description;
  private double amount;
  private String date;


  public Expense(String category, String description, double amount, String date){
      this.category = category;
      this.description = description;
      this.amount = amount;
      this.date = date;
  }

  public double getAmount() {
        return amount;  // This "gets" the value of amount
    }
  public String getCategory() {
       return category;
  }


    @Override
    public String toString() {
        return  category + " | " + description + " | " + amount + " | " + date;
    }
}