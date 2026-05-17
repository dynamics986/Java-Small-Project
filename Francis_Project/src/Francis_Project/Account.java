package Francis_Project;

/**
 *
 * @author fansixing
 */
public class Account {
  // class field
  public static double minBalance = 100.00;
  // instance field
  protected double balance;
  protected double noChequeIssued;

  // constructor method
  public Account(double initialBalance) {
      balance = initialBalance;
  }
  
//  public Account(double initialCheque) {
//      noChequeIssued = initialCheque;
//  }
  
  public Account (double initialBalance,double initialCheque){
      balance = initialBalance;
      noChequeIssued = initialCheque;
  }
  // instance method
  public void deposit(double amount) {
      balance += amount;
  }
  public void withdraw(double amount) {
      balance -= amount;
  }
}

