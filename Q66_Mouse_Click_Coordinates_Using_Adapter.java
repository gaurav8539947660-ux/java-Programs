import java.awt.event.*;
import javax.swing.*;

public class Q66_Mouse_Click_Coordinates_Using_Adapter {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });

        f.setSize(300,300);
        f.setVisible(true);
    }
}