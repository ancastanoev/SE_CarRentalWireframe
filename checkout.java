package org.example;

import javax.swing.*;
import java.awt.*;

class BookingConfirmationUI extends JFrame {

    public BookingConfirmationUI() {
        setTitle("Booking Confirmation");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel icon = new JLabel("👤");
        icon.setFont(new Font("SansSerif", Font.PLAIN, 40));
        icon.setAlignmentX(Component.CENTER_ALIGNMENT);
        card.add(icon);
        card.add(Box.createVerticalStrut(15));

        JTextArea details = new JTextArea(
                "Car selected:\n  Fiat Linea\n\n" +
                        "Rental period:\n  Pick up date: 05.05.2025\n" +
                        "  Drop-off date: 09.05.2025\n\n" +
                        "Pickup location:\n  Bozovici, Romania\n\n" +
                        "Total price:\n  215.00$"
        );
        details.setFont(new Font("SansSerif", Font.PLAIN, 14));
        details.setEditable(false);
        details.setOpaque(false);
        card.add(details);

        card.add(Box.createVerticalStrut(20));

        JPanel placeholder = new JPanel();
        placeholder.setPreferredSize(new Dimension(150, 100));
        placeholder.setMaximumSize(new Dimension(150, 100));
        placeholder.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        card.add(placeholder);
        placeholder.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(card, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookingConfirmationUI::new);
    }
}
