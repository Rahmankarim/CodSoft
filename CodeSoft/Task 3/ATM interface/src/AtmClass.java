public class AtmClass {


    private BankAcc bankAccount;

    public AtmClass(BankAcc bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");


        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (bankAccount.withdraw(amount)) {
            System.out.println("------------------------------------------------------");
            System.out.println("Withdrawal successful. Remaining balance: " + bankAccount.getBalance());
            System.out.println("------------------------------------------------------");
        }
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
        System.out.println("------------------------------------------------------");
        System.out.println("Deposit successful. New balance: " + bankAccount.getBalance());
        System.out.println("------------------------------------------------------");
    }

    public void checkBalance() {
        System.out.println("------------------------------------------------------");
        System.out.println("Current balance: " + bankAccount.getBalance());
        System.out.println("------------------------------------------------------");
    }

}
