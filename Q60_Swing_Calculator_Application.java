import javax.swing.*;

public class Q60_Swing_Calculator_Application {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField t = new JTextField();
        JButton b = new JButton("+");

        t.setBounds(50,50,200,30);
        b.setBounds(50,100,50,30);

        b.addActionListener(e -> t.setText("Result"));

        f.add(t);
        f.add(b);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}