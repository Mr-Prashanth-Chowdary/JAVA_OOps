package OOps.BankAccount;

public class Main {
    public static void main(String[] args)  {
        BankAccount B1 = new BankAccount();
        B1.setAccountHolderName("CH. Prashanth Chowdary");
        B1.setAccountNumber("123456");
        B1.deposit(1000.00);
        B1.withdraw(500);
        System.out.println(B1);
    }
}
