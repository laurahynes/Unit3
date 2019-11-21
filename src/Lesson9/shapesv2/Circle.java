package Lesson9.shapesv2;
import TurtleGraphics.Pen;
import java.awt.Color;

public class Circle extends Shape {
    
    protected double radius; //protected = only for me and my children  
    
    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }
    
    public Circle(){
        super(); //call Shape default constructor
        radius = 30;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = (2 * Math.PI * radius) / 120;
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(radius);
        p.turn(90);
        p.down();
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
        
        
    }

    
    @Override
    public void stretchBy(double factor) {
        double r = radius * factor;
        if(r<200)
            radius = r;
        
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String toString(){
        String str = "Circle\n======\n";
        str+= "\nRadius: " + radius;
        str+= super.toString();
        return str;
    }

    @Override
    double perimeter() {
        return (radius+radius);        
    }
          
}
