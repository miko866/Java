package bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args)
    {
        Checking chkacc1 = new Checking("Michal Durik", "123456789", 1500);

        Savings savacc1 = new Savings("Lenka Durik", "987654321", 2500);

        savacc1.showInfo();

        System.out.println("***********************");

        chkacc1.showInfo();

        savacc1.deposit(5000);
        savacc1.withdraw(2970);
        savacc1.transfer("PostFinance", 1200);

    }
}
