package org.example;

import javax.swing.*;
import java.awt.*;

class LoginUI extends JFrame {

    public LoginUI() {
        setTitle("Login - RentA");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createTitledBorder("Sign In"));
        formPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        formPanel.add(new JLabel("User Name:"));
        JTextField usernameField = new JTextField("ancastanoev");
        formPanel.add(usernameField);

        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField("password123");
        formPanel.add(passwordField);

        JButton signInButton = new JButton("SIGN IN");
        signInButton.setBackground(new Color(102, 204, 170));
        signInButton.setForeground(Color.WHITE);
        signInButton.setFocusPainted(false);
        signInButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signInButton.setMaximumSize(new Dimension(100, 30));

        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(signInButton);

        JLabel forgotLabel = new JLabel("<html><a href='#'>Forgot Password?</a></html>");
        forgotLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgotLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(forgotLabel);

        JLabel signupLabel = new JLabel("Don't have an account?");
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setBackground(new Color(102, 204, 170));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setFocusPainted(false);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signUpButton.setMaximumSize(new Dimension(100, 30));

        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(signupLabel);
        formPanel.add(signUpButton);

        add(formPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginUI::new);
    }
}
