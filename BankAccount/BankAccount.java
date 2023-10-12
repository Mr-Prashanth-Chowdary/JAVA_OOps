package OOps.BankAccount;

public class BankAccount {
   private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(){
        this.balance = 0.00;
    }



    //setters
    public void setAccountNumber(String accountNumber) {
        if(!(accountNumber.isBlank() && accountNumber.isEmpty())) {
           this.accountNumber = accountNumber;
        }
        else{
            throw new IllegalArgumentException("the account number not to be empty and null");
        }
    }

    public void setAccountHolderName(String accountHolderName) {
        if(!(accountHolderName.isEmpty() && accountHolderName.isBlank())) {
            if(accountHolderName.length() > 3){
                this.accountHolderName = accountHolderName;
            }
            else{
                throw new IllegalArgumentException("the account holder name must more then 3 characters long.");
            }

        }
        else{
            throw new IllegalArgumentException("The account holder name not to be blank/empty");
        }
    }
    // getters

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    //methods
    public void deposit(double amount){
        if(amount > 0){
            this.balance = getBalance()+amount;

            // this is an ack to mail or sms to mobile
            System.out.println("the amount is credited to you account number "+getAccountNumber() +" is of "+amount+" the current balance is of "+getBalance());
        }
        else{
            throw new IllegalArgumentException("the account balance is not sufficient to maintain");
        }
    }
    public void withdraw(double amount)  {
        if(this.balance >= amount){
            this.balance = getBalance() - amount;

            // this is an ack to mail or sms to mobile
            System.out.println("The amount is debited "+amount+" remaining balance is of "+getBalance());
        }
        else{
            throw new IllegalArgumentException("the amount is un-sufficient to withdraw");
        }
    }

    public String toString(){
        return " Account Number :"+getAccountNumber()+"\n Account Holder Name :"+getAccountHolderName()+"\n Balance : $"+getBalance();
    }


}
