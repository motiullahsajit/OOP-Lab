public class Calculator {

    public static void main(String[] args){
        MyTest add = new Addition();
        System.out.println("Addition = " +add.calculate(5, 6));
        
        MyTest sub = new Subtraction();
        System.out.println("Subtraction = " +sub.calculate(7, 6));

        MyTest mul = new Multiplication();
        System.out.println("Multiplication = " +mul.calculate(4, 5));
        

    }
    
}
