package Lesson9.shapesv2;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    
    private double spokes;
    //wheel has 4 properties
    //it inherits x, y, radius from Circle
    
    public Wheel(double x, double y, double r, double s) {
        super(x, y, r); //call the Parent class constructor
        spokes = s;
    }
    
    public Wheel(){
        super(); //call the Circle constructor
        spokes = 5;
    }
    
    //all methods from Circle are available to wheel by default
    
    //some methods -> area, getx&y, stretchby, move are fine as is from Circle
    
    //others -> draw are a good start but need to be added on to (extended)
    //toString -> we will override completely
    
    public void draw(Pen p){
        //call the parent version of draw
        super.draw(p);
        
        //draw the spokes
        for (int i = 0; i < spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i *(360/spokes));
            p.move(radius);            
        }
    }
    
    //exclusive to method only for wheels
    public void setSpoke(int s){
        spokes = s;
    }
    
    
    //completely override the parent
    public String toString(){
        String str = "Wheel\n=====\n";
        str+= "Xpos: " + xPos + " Ypos: " + yPos;
        str+= "\nRadius: " + radius;
        str+= "\nSpokes: " + spokes;
        str+= String.format("\nArea: %.2f", area());        
        return str;
    }
    
}
