package anotherbank;

import somebank.Account;

class CurrentAccount extends Account
{
  // modified class field
  public static double minBalance = 5.00;
  // added instance field
  private int noChequesIssued;

  // constructor method
  public CurrentAccount(double initialBalance)
  {
    // call the constructor of the super class
    super(initialBalance);
    noChequesIssued = 0;
  }

  // added instance method
  public void issueCheque()
  {
    noChequesIssued++;
    System.out.println(noChequesIssued + " cheques issued so far.");
    System.out.println("Balance: " + balance);
  }

  public void transferFrom(Account source)
  {
      // invalid access
      // source.balance -= 1000;
      this.balance += 1000;
  }
  
  // main method
  public static void main(String[] args)
  {
    CurrentAccount michaelCheque;
    michaelCheque = new CurrentAccount(100);
    michaelCheque.deposit(200);
    michaelCheque.issueCheque();
    michaelCheque.issueCheque();
    michaelCheque.issueCheque();
    
    // michaelCheque.privatePocket -= 9000;
  }
}
