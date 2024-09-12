package Inheritance;

import java.awt.*;

public class Circle extends Shape implements Drawable{
    private int radius;

    public Circle(int x, int y, Color color, int radius) {
//     Add the parameters here as well

        super(x, y, color);
//      You have to put the parameters that are defined in the class shape
        this.radius = radius;

    }

    public double area() {

//       This formula  need to be changed depending on the class you are working in
        return  Math.PI * radius * radius;
    }
// This is the shorten way to write the equation, check Circle class for the long form
    public double circumference() {

        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawOval(getX(), getY(), 120, 150);

    }
}
