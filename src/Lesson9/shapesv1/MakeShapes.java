package Lesson9.shapesv1;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class MakeShapes{

    public static void main(String[] args) {
        
        Wheel w = new Wheel(10,10,50,6);
        System.out.println("Wheel is at " + w.getXPos() + ", " + w.getYPos());
        
        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if(i<3) shp[i] = getRandCircle();
            else if (i<8) shp[i] = getRandRect();
            else shp[i] = getRandWheel();
        }
        //draw all 10 shapes
        Pen p = new StandardPen(new SketchPadWindow (640,480));
        for (Shape shape : shp) {
            shape.draw(p);
        }
        //resize each shape
        Scanner scan = new Scanner(System.in);       
        for (Shape shape : shp) {
            System.out.print("Press any key to shrink a shape");
            scan.nextLine();
            shape.erase(p);
            shape.stretchBy(0.5);
            shape.draw(p);
        }        
        for (Shape shape : shp) {
            System.out.print("Press any key to move a shape");
            scan.nextLine();
            shape.erase(p);
            shape.move(shape.getXPos() + 50, shape.getYPos() + 50);
            shape.draw(p);
        }
        System.out.print("Press any key to turn all circles green");
        for (Shape shape : shp) {
            if(shape instanceof Circle)
                ((Circle)shape).turnGreen(p);
            System.out.println(w.toString());
            //this is what casting an object looks like
            //(int) z
            
        }
        System.out.println("And wheels have had their spokes set to 20");
        for (Shape shape : shp) {
            if(shape instanceof Wheel){
                shape.erase(p);
                ((Wheel) shape).setSpoke(20);
                shape.draw(p);
            }
        }
    }
    
    public static Circle getRandCircle(){
        Circle temp = new Circle((Math.random() * 400 - 200),
                                 (Math.random() * 400 - 200), 
                                 (Math.random() * 50 + 50));
        return temp;
    }
    
    public static Circle getRandWheel(){
        Wheel temp = new Wheel((Math.random() * 400 - 200),
                                 (Math.random() * 400 - 200), 
                                 (Math.random() * 50 + 50), 10); //default 5 spokes
        return temp;
    }
    
    public static Rect getRandRect(){
        Rect temp = new Rect((Math.random() * 400 - 200),
                             (Math.random() * 400 - 200), 
                             (Math.random() * 100 + 50),
                             (Math.random() * 100 + 50));
        return temp;
    }
    
}
