import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        BankAcc account = new BankAcc(1000); // Initial balance 1000/RS
        AtmClass atm = new AtmClass(account);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    int deposit=scanner.nextInt();
                    atm.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit:");
                    int withdrawl=scanner.nextInt();
                    atm.withdraw(withdrawl);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();

        }
    }