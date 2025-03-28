package org.example;

import javax.swing.*;
import java.awt.*;

class MakeReservationUI extends JFrame {

    public MakeReservationUI() {
        setTitle("Make Reservation");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnMain = new JButton("Main page");
        JButton btnReserve = new JButton("Make reservation");
        JButton btnCheck = new JButton("Check availability");
        JButton btnReturn = new JButton("Return vehicle");
        JButton btnReport = new JButton("Provide report");

        btnReserve.setBackground(Color.BLUE);
        btnReserve.setForeground(Color.WHITE);

        btnMain.setBounds(10, 10, 110, 25);
        btnReserve.setBounds(125, 10, 150, 25);
        btnCheck.setBounds(280, 10, 160, 25);
        btnReturn.setBounds(445, 10, 130, 25);
        btnReport.setBounds(580, 10, 140, 25);

        add(btnMain);
        add(btnReserve);
        add(btnCheck);
        add(btnReturn);
        add(btnReport);

        JTextField searchField = new JTextField("Search");
        searchField.setBounds(10, 45, 250, 25);
        add(searchField);

        JButton searchBtn = new JButton("🔍");
        searchBtn.setBounds(270, 45, 50, 25);
        add(searchBtn);

        JPanel promo = new JPanel(null);
        promo.setBounds(10, 90, 350, 150);
        promo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel promoText = new JLabel("<html><div style='text-align: center;'>" +
                "<span style='font-weight: bold;'>Get 10% OFF</span> when<br>" +
                "you rent for 5 days<br>or more.<br><br>" +
                "Hurry — offer ends<br>April 30th!" +
                "</div></html>");
        promoText.setBounds(180, 10, 150, 120);
        promoText.setFont(new Font("SansSerif", Font.PLAIN, 14));
        promoText.setForeground(Color.WHITE);
        promo.setBackground(new Color(80, 20, 20));
        promo.add(promoText);

        JPanel promoImg = new JPanel();
        promoImg.setBounds(20, 20, 120, 100);
        promoImg.setBackground(Color.LIGHT_GRAY);
        promo.add(promoImg);
        add(promo);

        JPanel map = new JPanel();
        map.setBounds(400, 90, 250, 150);
        map.setBackground(new Color(255, 240, 200));
        map.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(map);

        JPanel stars = new JPanel(new FlowLayout(FlowLayout.LEFT));
        stars.setBounds(400, 250, 250, 40);
        for (int i = 1; i <= 5; i++) {
            JLabel star = new JLabel(i < 5 ? "★" : "☆");
            star.setFont(new Font("SansSerif", Font.PLAIN, 28));
            stars.add(star);
        }
        add(stars);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MakeReservationUI::new);
    }
}
