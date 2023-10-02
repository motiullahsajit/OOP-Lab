public class BankAccount {
    String accountName;
    double balance;

    BankAccount(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    void deposit(double amount){
        System.out.println(amount+" Deposited to the account");
    }
    
    void withdraw(double amount){
        System.out.println(amount+" Withdrwal from the account");
    }

}
