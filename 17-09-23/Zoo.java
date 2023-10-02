public class Zoo {
    public static void main(String[] args){
        Lion lion1 = new Lion("Sakib", "Tall and Strong", "brown and black");
        lion1.eat("Meat");
        lion1.info();

        Elephant elephant1 = new Elephant("Ell", "Heavy", "Grey");
        elephant1.eat("Banana tree");
        elephant1.info();
        
        Giraffe giff1 = new Giraffe("Giffy", "Tallest", "Yeallow");
        giff1.eat("Leaf");
        giff1.info();

    }
}
