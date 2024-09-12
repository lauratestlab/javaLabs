package Inheritance;

import java.awt.*;

public class Rectangle extends Shape implements Drawable {
//  extends allows you to
    private int width;
    private int height;
    public Rectangle(int x, int y, Color color, int width, int height){
//        The parameters of the constructor contains the values from the Shape class
        super(x,y,color);
        this.width=width;
        this.height=height;
    }


    public double area(){
     double result = (width * height);
     return result;
    }
    public double circumference(){
        double result = 2 * width + 2 * height ;
        return result;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawRect(getX(),getY(),100,200);

    }
}
