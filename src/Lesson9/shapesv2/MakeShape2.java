package Lesson9.shapesv2;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class MakeShape2 {

    public static void main(String[] args) {
       StandardPen p = new StandardPen(new SketchPadWindow(800,600));     
       Circle c = new Circle();//default
       Rect r = new Rect();
       c.draw(p);
       r.draw(p);
    }
    
}
