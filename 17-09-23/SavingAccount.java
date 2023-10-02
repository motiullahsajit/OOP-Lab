public class SavingAccount extends BankAccount{
    SavingAccount(String accountName, double balance){
        super(accountName, balance);
    }
    void withdraw(double amount){
        if(super.balance >= 100){
            System.out.println(amount+" Withdrwal from the account");
        }else{
            System.out.println("Withdrwal fail because your balance is under 100");
        }

    }
}
