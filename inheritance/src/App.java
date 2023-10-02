public class App {
    public static void main(String[] args){
        Dbbl account1 = new Dbbl(1234, 7800099.00, "Debit");
        account1.withDraw();

        Tbbl account2 = new Tbbl(421, 9900099.99, "Credit");
        account2.withDraw();
    }
}
