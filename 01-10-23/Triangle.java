public class Triangle extends Shape {
    int height;
    int base;
    
    void getArea(){
        System.out.println("Area of triangle: "+(0.5*height* base));
    }

    public String toString(){
        return "height: "+height+", base: "+base+ ", color: "+super.color;
    }
    
}
