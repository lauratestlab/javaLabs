package Inheritance;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;

public class Display {
    private static JPanel canvas;

    //   JPanel is a container
    public static void main(String[] a) {
        initGUI();
        drawAllShapes(canvas.getGraphics());
    }

    private static void drawAllShapes(Graphics g) {
        //TODO: Implement me
        ArrayList<Drawable> drawables = new ArrayList<>();
//        This is the arraylist created with the instance drawables

        drawables.add(new Circle(100, 200, Color.CYAN, 15));
        drawables.add(new Rectangle(350, 400, Color.RED, 35, 98));
        for (Drawable drawable : drawables) {
//         This is a for each statement
            drawable.draw(g);
        }



    }


    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics g) {
                drawAllShapes(g);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}


