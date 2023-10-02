public class Rectangle extends Shape {
    int length;
    int width;
    
    void getArea(){
        System.out.println("Area of rectangle: "+(length* width));
    }

    public String toString(){
        return "length: "+length+", width: "+width+ ", color: "+super.color;
    }
}
