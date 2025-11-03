/*
To-Do
Use Graphics2D + mouse input
Generate Towns(Own class that checks when failed)
*/

import javax.swing.*;

public class Main {
    static CustomPanel panel = new CustomPanel(600,600);;
    static Map map = new Map();
    static int counter;
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("British Mini-Metro");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.addMap(map);
        panel.addMouseListener(new GameMouseInput());
        //Key Bindings

        frame.add(panel);
        frame.setVisible(true);

        Timer timer = new Timer(100,e -> {
            //Updates Every Tick
            panel.repaint();
            counter += 1;
        });
        timer.start();
    }
}
