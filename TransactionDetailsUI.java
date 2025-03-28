package org.example;

import javax.swing.*;
import java.awt.*;

class TransactionDetailsUI extends JFrame {

    public TransactionDetailsUI() {
        setTitle("Transaction Details");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        
        JLabel title = new JLabel("Transaction Details", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
        title.setForeground(new Color(72, 175, 163));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel(new BorderLayout());
        
        JTextArea info = new JTextArea();
        info.setEditable(false);
        info.setFont(new Font("SansSerif", Font.PLAIN, 14));
        info.setText(
                "User: Anca Stanoev                 Membership ID: U123456\n" +
                        "Email: ancastanoev@gmail.com\n\n" +
                        "Car Model: Toyota Sienna\n" +
                        "Price: USD 400 / 5 days\n" +
                        "Location: Airport Office\n" +
                        "Rental No.: ABC123\n" +
                        "Pickup: 05/10/2025 (10 AM)\n" +
                        "Return: 05/15/2025 (2 PM)"
        );
        centerPanel.add(info, BorderLayout.CENTER);
        
        JPanel placeholder = new JPanel();
        placeholder.setPreferredSize(new Dimension(200, 200));
        placeholder.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        centerPanel.add(placeholder, BorderLayout.EAST);

        add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        JPanel buttonPanel = new JPanel();
        JButton searchBtn = new JButton("Search");
        JButton printBtn = new JButton("Print Receipt");
        printBtn.setBackground(new Color(66, 133, 244));
        printBtn.setForeground(Color.WHITE);
        printBtn.setFocusPainted(false);
        buttonPanel.add(searchBtn);
        buttonPanel.add(printBtn);
        
        JLabel note = new JLabel("Please verify your details before printing the transaction receipt.");
        note.setHorizontalAlignment(SwingConstants.CENTER);
        note.setFont(new Font("SansSerif", Font.ITALIC, 12));

        bottomPanel.add(buttonPanel, BorderLayout.CENTER);
        bottomPanel.add(note, BorderLayout.SOUTH);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TransactionDetailsUI::new);
    }
}
