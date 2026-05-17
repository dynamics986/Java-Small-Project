package somebank;

public class Account {
  // class field
  public static double minBalance = 100.00;
  // instance field
  protected double balance;

  /* default */ double privatePocket;
  
  
  // constructor method
  public Account(double initialBalance) {
    balance = initialBalance;
    privatePocket = 9999;
  }

  // instance method
  public void deposit(double amount) {
    balance += amount;
  }
  public void withdraw(double amount) {
    balance -= amount;
  }
}

