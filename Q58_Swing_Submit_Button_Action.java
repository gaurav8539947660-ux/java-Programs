import javax.swing.*;

public class Q58_Swing_Submit_Button_Action {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Submit");
        JLabel l = new JLabel();

        b.setBounds(50,50,100,30);
        l.setBounds(50,100,200,30);

        b.addActionListener(e -> l.setText("Submitted"));

        f.add(b);
        f.add(l);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}