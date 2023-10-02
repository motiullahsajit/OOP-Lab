 public class Tbbl extends Atm {
    public String card;

    public static void withDraw(){
        System.out.println("Tbbl withdraw");
    }

    Tbbl(int accountId, double salaryAmount, String cardName){
        account = accountId;
        salary = salaryAmount;
        card = cardName;

        System.out.println("Account NO: "+account+"\nSalary: "+salary+"\nCard: "+card);
    }

}
