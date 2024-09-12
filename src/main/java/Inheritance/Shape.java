package Inheritance;

import java.awt.*;

public abstract class Shape {
    public abstract double circumference();
//  The abstract method is used to create blueprints for classes or interfaces
//   Check the use of the method in the other classes
    public abstract double area();

    private int x;
    private int y;
    private Color color;
//  Color has been declared as an object instead of a string
//  With an object you are able call the color without the variable String
//  and the color

    public Shape(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    public Shape(int x,int y){
        this.x=x;
        this.y=y;
    }


    public String toString() {
        String line = x +"\n" +y+ "\n"+color;
        return line;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
