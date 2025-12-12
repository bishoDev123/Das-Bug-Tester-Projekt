package Authentication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("login");
    JButton resetButton = new JButton("reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");

    HashMap<String, String> logininfo = new HashMap<String, String>();

    public LoginPage(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
