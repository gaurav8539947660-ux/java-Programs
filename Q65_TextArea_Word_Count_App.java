import javax.swing.*;

public class Q65_TextArea_Word_Count_App {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextArea t = new JTextArea();
        JButton b = new JButton("Count");

        t.setBounds(20,20,200,100);
        b.setBounds(20,130,100,30);

        b.addActionListener(e -> {
            String text = t.getText();
            int words = text.split(" ").length;
            JOptionPane.showMessageDialog(f, "Words: " + words);
        });

        f.add(t);
        f.add(b);

        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}