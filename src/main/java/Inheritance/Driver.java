package Inheritance;

import java.awt.Color;

public class Driver {
    public static void main(String[] args) {
        Circle c =  new Circle(4,5, Color.BLACK, 5);
//      When creating a new instance the amount and or string needs to be entered
        System.out.println(c);
        System.out.println(c.circumference());
        System.out.println(c.circumference());

        Rectangle r = new Rectangle(3,4,Color.BLUE,10, 15);
        System.out.println(r.circumference());
        System.out.println(r.area());

    }
}
