import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    Map map;
    public CustomPanel(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.cyan);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        map.paint(g2d);
    }
    public void addMap(Map map){
        this.map = map;
    }

}
