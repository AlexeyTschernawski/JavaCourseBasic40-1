package homeworks.homework21.bank;


public class BankingOperation {

    private BankAccount bankAccount;

    public BankingOperation(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.balance = bankAccount.getAccountBalance();
    }

    double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + " рублей");
        } else {
            System.out.println("Сумма для внесения должна быть положительной");
        }
    }

    // Метод для снятия средств со счета
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + " рублей");
        } else {
            System.out.println("Недостаточно средств на счете или сумма для снятия некорректна");
        }
        return amount;
    }


        public double getBalance() {
            return balance;
        }
    }


