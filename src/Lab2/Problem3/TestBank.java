package Problem3;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account basic  = new Account(1001);
        SavingsAccount savings = new SavingsAccount(1002, 5.0);
        CheckingAccount checking = new CheckingAccount(1003);

        bank.openAccount(basic);
        bank.openAccount(savings);
        bank.openAccount(checking);

        basic.deposit(1000);
        savings.deposit(5000);
        checking.deposit(3000);

        System.out.println(" After initial deposits ");
        bank.printAllAccounts();

        checking.deposit(100);
        checking.deposit(200);
        checking.withdraw(50);
        checking.withdraw(75);
        checking.deposit(300);
        checking.withdraw(25);
        checking.deposit(10);

        System.out.println("\n After checking transactions ");
        bank.printAllAccounts();

        bank.update();

        System.out.println("\n After bank update ");
        bank.printAllAccounts();

        basic.transfer(200, savings);
        System.out.println("\n After transfer $200 from basic to savings ");
        bank.printAllAccounts();

        bank.closeAccount(1001);
        System.out.println("\n After closing account 1001 ");
        bank.printAllAccounts();
    }
}
