import java.awt.*;
import javax.swing.*;

public class Q67_Layout_Manager_Demo {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setLayout(new FlowLayout());
        f.add(new JButton("Flow"));

        f.setLayout(new BorderLayout());
        f.add(new JButton("North"), BorderLayout.NORTH);

        f.setSize(300,200);
        f.setVisible(true);
    }
}