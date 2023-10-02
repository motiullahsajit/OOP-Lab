public class Shapes {

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.color = "Red";
        r.length = 4;
        r.width = 5;
        
        System.out.println(r.toString());
        r.getArea();
        
        Triangle t = new Triangle();
        t.color = "Green";
        t.base = 2;
        t.height = 5;

        System.out.println(t.toString());
        t.getArea();


    }
    
}
