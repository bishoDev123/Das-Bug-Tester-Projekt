package Authentication;

import Users.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    //define all the components used in the login page
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("login");
    JButton resetButton = new JButton("reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel testMessage = new JLabel("This is a test message");

    HashMap<String, User> users;

    public LoginPage(HashMap<String, User> originalUsers) {
        this.users = originalUsers;

        // set the labels for input fields
        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        // set the input fields
        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        // set the buttons and their action listeners
        loginButton.setBounds(175, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        // set the test message for troubleshooting
        testMessage.setBounds(100, 250, 400, 50);
        testMessage.setFont(new Font(null, Font.ITALIC, 25));

        // add the components to the frame
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(testMessage);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        // set the default settings for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = userIdField.getText();
        String password = String.valueOf(userPasswordField.getPassword());

        if (!users.containsKey(id)) {
            testMessage.setText("User not found");
            return;
        }

        User u = users.get(id);

        if (!u.getPassword().equals(password)) {
            testMessage.setText("Wrong password");
            return;
        }

        if (u instanceof Admin) {
            testMessage.setText("Welcome admin");
        } else if (u instanceof Developer) {
            testMessage.setText("Welcome developer");
        } else if (u instanceof ProjectManager) {
            testMessage.setText("Welcome PM");
        } else if (u instanceof Tester) {
            testMessage.setText("Welcome Tester");
        }
    }
}
