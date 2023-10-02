public class Giraffe extends Animal{
    Giraffe(String name, String description, String color){
        super(name, description, color);
    }

    void eat(String item){
        System.out.println("Giraffe eats " + item);
    }
}
