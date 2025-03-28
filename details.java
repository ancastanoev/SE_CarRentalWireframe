package org.example;

import javax.swing.*;
import java.awt.*;

class CarRentalUI extends JFrame {

    public CarRentalUI() {
        setTitle("Car Rental System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Customer Info"));

        formPanel.add(new JLabel("First Name:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Last Name:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Email:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Phone Number:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Pickup Point:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Drop-off Point:"));
        formPanel.add(new JTextField());

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel carGrid = new JPanel(new GridLayout(3, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            JButton carBtn = new JButton("Car " + i);
            carGrid.add(carBtn);
        }

        JLabel calendarLabel = new JLabel("Calendar Placeholder: October 2014", SwingConstants.CENTER);
        calendarLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JPanel ratingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        for (int i = 1; i <= 5; i++) {
            JLabel star = new JLabel(i <= 4 ? "★" : "☆"); // 4/5 stars filled
            star.setFont(new Font("SansSerif", Font.PLAIN, 24));
            ratingPanel.add(star);
        }

        rightPanel.add(carGrid);
        rightPanel.add(calendarLabel);
        rightPanel.add(ratingPanel);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(formPanel);
        mainPanel.add(rightPanel);

        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CarRentalUI::new);
    }
}
