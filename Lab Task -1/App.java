public class App {
    public static void main(String[] args) {
        Apple iphone = new Apple("iPhone 13", 999, true);
        Samsung samsungGalaxy = new Samsung("Galaxy S21", 799, true);
        Xiaomi xiaomiPhone = new Xiaomi("Redmi Note 10", 299, "12.5");

        iphone.makeCall("123-456-7890");
        samsungGalaxy.sendText("987-654-3210", "Hello from Samsung!");
        xiaomiPhone.checkBattery();
        xiaomiPhone.checkMiuiVersion("Xaomi","Note 12");
    }
}
