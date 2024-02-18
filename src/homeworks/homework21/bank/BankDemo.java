package homeworks.homework21.bank;

public class BankDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000.30);

        BankingOperation bankingOperation = new BankingOperation(bankAccount);

        System.out.println("balance account: " + bankAccount.getAccountBalance() + " €");

        double depositAmount = 500.40;
        bankingOperation.deposit(depositAmount);
        System.out.println("balance after deposit: " + bankingOperation.getBalance() + " €");

        double withdrawAmount = 400.80;
        bankingOperation.withdraw(withdrawAmount);
        System.out.println("balance after withdraw: " + bankingOperation.getBalance() + " €");

    }
}
