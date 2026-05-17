package Francis_Project;

/**
 *
 * @author fansixing
 */
class CurrentAccount extends Account {
  // instance field
  private int noChequesIssued;
  
  // constructor method
  public CurrentAccount(double initialBalance) {
      super(initialBalance);
      noChequesIssued = 0;
  }
  
  // instance method
  public void issueCheque() {
      noChequesIssued++;
      System.out.println(noChequesIssued +
                     " cheques issued so far.");
      System.out.println("Balance: " + balance);
  }
  // main method
  public static void main(String[] args) {
      CurrentAccount michaelCheque;
      michaelCheque = new CurrentAccount(100);
      michaelCheque.deposit(200);
      michaelCheque.issueCheque();
  }
}
