public class q1_BankAccount {
    private double balance;

    public q1_BankAccount(double  initializebalance) {
            this.balance=initializebalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }




    public static void main(String[] args) {
        q1_BankAccount account = new q1_BankAccount(1000);

         // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());





    }
}
