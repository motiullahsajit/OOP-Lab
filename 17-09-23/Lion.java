public class Lion extends Animal {
    Lion(String name, String description, String color){
        super(name, description, color);
    }

    void eat(String item){
        System.out.println("Lion eats " + item);
    }

}
