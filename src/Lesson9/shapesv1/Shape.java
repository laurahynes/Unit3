package Lesson9.shapesv1;
import TurtleGraphics.Pen;

public interface Shape {
   public double area();
   public void draw(Pen p);
   public double getXPos();
   public double getYPos();
   public void move(double xLoc, double yLoc);
   public void stretchBy(double factor);
   public String toString();
   public void erase(Pen p);
}
