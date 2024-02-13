public class BankAcc {
        private double balance;

        public BankAcc(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {

                System.out.println("------------------------------------------------------");

                System.out.println("Insufficient funds");

                System.out.println("------------------------------------------------------");
                return false;
            }
            balance -= amount;
            return true;
        }
}
