public class Samsung extends Phone {
    private boolean stylusSupported;

    public Samsung(String model, double price, boolean stylusSupported) {
        super("Samsung", model, price);
        this.stylusSupported = stylusSupported;
    }

    public void useStylus(String brand, String model) {
        if (stylusSupported) {
            System.out.println(brand+ " " + model + " comes with a stylus.");
        } else {
            System.out.println(brand + " " + model + " does not support a stylus.");
        }
    }
}