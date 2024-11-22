//program two
package PackImp;

class BankApplication {

    // BankAccount class within the same file
    static class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: Rs. " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                System.out.println("Invalid or insufficient funds for withdrawal");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: Rs. " + amount);
            }
        }

        public void displayBalance() {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: Rs. " + balance);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 5000.0);

        account1.displayBalance();
        account1.deposit(1500.0);
        account1.displayBalance();

        account1.withdraw(2000.0);
        account1.displayBalance();

        account1.withdraw(5000.0);  // Insufficient funds, should be handled
        account1.displayBalance();
    }
}
