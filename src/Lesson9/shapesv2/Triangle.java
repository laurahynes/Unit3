package Lesson9.shapesv2;

import TurtleGraphics.Pen;

public class Triangle extends Shape {

    double  xPos2, xPos3, yPos2, yPos3;
    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
        super(x1, y1);
        xPos2 = x2;
        yPos2 = y2;
        xPos3 = x3;
        yPos3 = y3;
    }
    public Triangle(){
        super();
        xPos2 = 50;
        yPos2 = 0;
        xPos3 = 25;
        yPos3 = 75;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
        xPos2 += xLoc;
        yPos2 += yLoc;
        xPos3 += xLoc;
        yPos3 += yLoc;
    }
    
    @Override
    double area() {
        return Math.abs(((xPos*yPos2-xPos2*yPos) + (xPos2*yPos3-xPos3*yPos2) + (xPos3*yPos-xPos*yPos3))/2);
    }

    @Override
    void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos2, yPos2);        
        p.move(xPos3, yPos3);
        p.move(xPos, yPos);
    }

    @Override
    void stretchBy(double factor) {
        xPos2 = (xPos2-xPos) * factor + xPos;
        xPos3 = (xPos3-xPos) * factor + xPos;
    }

    @Override
    double perimeter() {
        return (Math.sqrt(((xPos-xPos2) * (xPos-xPos2)) + ((yPos-yPos2) * (yPos-yPos2))));
    }
    
    public String toString(){
        String str = super.toString();
        str+= "\nXpos2: " + xPos2 + " Ypos2: " + yPos2;
        str+= "\nXpos3: " + xPos3 + " Ypos2: " + yPos3;
        return str;
    }
    
}
