public class ATM {
    private String accountNumber;
    private int accountBalance;
    
    public void deposit(int amount) {
     
        accountBalance =accountBalance+amount;
    }
    
    public void withdraw(int amount) {
 
        accountBalance =accountBalance-amount;
    }
    
    public int getBalance() {
        return accountBalance;
    }
    
    public void AddAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public static void main(String[] args) {
    
        ATM atm = new ATM();
        atm.AddAccountNumber("1000778383");
        atm.deposit(1500);
        System.out.println("Account Number: " + atm.accountNumber);
        System.out.println("Balance after deposit: " + atm.getBalance());
        atm.withdraw(700);
        System.out.println("Balance after withdrawal: " + atm.getBalance());
    }
}
