public class Xiaomi extends Phone {
    private String miuiVersion;

    public Xiaomi(String model, double price, String miuiVersion) {
        super("Xiaomi", model, price);
        this.miuiVersion = miuiVersion;
    }

    public void checkMiuiVersion(String brand, String model) {
        System.out.println(brand + " " + model + " is running MIUI version " + miuiVersion + ".");
    }
}