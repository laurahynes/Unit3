package Lesson9.shapesv1;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect implements Shape {
    private double xPos, yPos;
    private double width, height;
    
    public Rect(double x, double y, double w, double h){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }
    
    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }
    
    public String toString(){
        String str = "Rectangle\n========\n";
        str+= "Xpos: " + xPos + " Ypos: " + yPos;
        str+="\nWidth: " + width + " Height: " + height;
        str+= String.format("\nArea: %.2f", area());        
        return str;
    }
    
    public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
}
