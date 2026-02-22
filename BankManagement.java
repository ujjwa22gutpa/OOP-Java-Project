class Bank {
    private int bankBalance = 0;

    int Withdrawl(int money) {
        if (money > bankBalance) {
            System.out.println("Money is not sufficient");
            return 0;
        }
        bankBalance -= money;
        System.out.println("Money withdrawl successfull");
        return bankBalance;
    }

    void Deposit(int money) {
        bankBalance += money;
        System.out.println("Money deposited successfully");
    }

    void currentBankBalance() {
        System.out.println("Your current BankBalance" + " " + bankBalance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Bank c1 = new Bank();
        c1.Deposit(500);
        c1.Deposit(1000);
        c1.currentBankBalance();
        c1.Withdrawl(200);
        c1.currentBankBalance();

    }
}
