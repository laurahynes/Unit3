package Lesson9.shapesv1;

import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class MakeShapes2 {

    public static void main(String[] args) {
        StandardPen p = new StandardPen(new SketchPadWindow(800,600));
        Circle c[] = new Circle[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new Circle(0,0,Math.random() * 300 + 20);
            c[i].draw(p);
        }
        System.out.format("The average radius is %.2f ", Circle.getAvgRadius());
    }
    
}
