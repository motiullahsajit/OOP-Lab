public class Phone {
    private String brand;
    private String model;
    private double price;
    private int batteryPercentage;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryPercentage = 100;
    }

    public void makeCall(String number) {
        System.out.println(brand + " " + model + " is making a call to " + number);
    }

    public void sendText(String number, String message) {
        System.out.println(brand + " " + model + " is sending a text to " + number + ": " + message);
    }

    public void checkBattery() {
        System.out.println("Battery percentage of " + brand + " " + model + ": " + batteryPercentage + "%");
    }
}