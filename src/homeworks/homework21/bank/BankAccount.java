package homeworks.homework21.bank;

public class BankAccount {

   private double accountBalance;

    public BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        return accountBalance;
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


