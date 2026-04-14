import javax.swing.*;

public class Q61_Swing_Login_Form_Validation {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton login = new JButton("Login");

        user.setBounds(50,50,150,30);
        pass.setBounds(50,100,150,30);
        login.setBounds(50,150,100,30);

        login.addActionListener(e -> {
            if (user.getText().equals("admin"))
                JOptionPane.showMessageDialog(f, "Success");
            else
                JOptionPane.showMessageDialog(f, "Fail");
        });

        f.add(user);
        f.add(pass);
        f.add(login);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}