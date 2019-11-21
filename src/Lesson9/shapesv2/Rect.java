package Lesson9.shapesv2;
import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape {
    private double width, height;
    
    public Rect(double x, double y, double w, double h){
        super(x,y);
        width = w;
        height = h;
    }
    public Rect(){
        super();
        width = 30;
        height = 30;
    }
    
    @Override
    public double area() {
        return width*height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);        
        
    }

    @Override
    public void stretchBy(double factor) {
        double w = width * factor;
        double h = height * factor;
        if(h<200 && w<200){
            width = w;
            height = h;
        }
     
    }
    
    public String toString(){
        String str = "Rectangle\n========\n";
        str+="\nWidth: " + width + " Height: " + height;
        str+=super.toString();
        return str;
    }

    @Override
    double perimeter() {
        return ((2*width) + (2*height));
    }
       
}
