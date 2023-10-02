public class Elephant extends Animal{
        Elephant(String name, String description, String color){
            super(name, description, color);
        }
    
        void eat(String item){
            System.out.println("Elephant eats " + item);
        }
    
}
