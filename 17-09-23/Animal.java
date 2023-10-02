public class Animal {
    String name;
    String description;
    String color;

    Animal(String name, String description, String color){
        this.name = name;
        this.description = description;
        this.color = color;
    }
    
    void eat(String item){
        System.out.println("Animal eat " + item);
    }

    void info(){
        System.out.println("\nAnimal Info: \n");
        System.out.println("Name: "+name+"\n");
        System.out.println("Description: "+description+"\n");
    }

}
