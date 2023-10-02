public class Apple extends Phone {
    private boolean faceIdSupported;

    public Apple(String model, double price, boolean faceIdSupported) {
        super("Apple", model, price);
        this.faceIdSupported = faceIdSupported;
    }

    public void useFaceId(String brand, String model) {
        if (faceIdSupported) {
            System.out.println(brand+ " " + model + " is using Face ID for authentication.");
        } else {
            System.out.println(brand + " " + model + " does not support Face ID.");
        }
    }
}