package org.example;

import javax.swing.*;
import java.awt.*;

class EmployeeDashboardUI extends JFrame {

    public EmployeeDashboardUI() {
        setTitle("Employee Dashboard");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel avatar = new JLabel("👤");
        avatar.setBounds(30, 30, 60, 60);
        avatar.setFont(new Font("SansSerif", Font.PLAIN, 40));
        add(avatar);

        JTextArea info = new JTextArea(
                "First name: John\n" +
                        "Last name: Doe\n" +
                        "Role: Rental Officer\n" +
                        "Branch: Bucharest Office\n" +
                        "Shift: 08:00 - 16:00"
        );
        info.setBounds(100, 30, 200, 100);
        info.setEditable(false);
        add(info);

        JPanel mapPlaceholder = new JPanel();
        mapPlaceholder.setBackground(Color.LIGHT_GRAY);
        mapPlaceholder.setBounds(320, 30, 80, 80);
        add(mapPlaceholder);

        JPanel accessBox = new JPanel(null);
        accessBox.setBounds(420, 30, 300, 100);
        accessBox.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));

        JLabel archivesText = new JLabel("Access archives");
        archivesText.setBounds(20, 20, 150, 20);
        accessBox.add(archivesText);

        JLabel archivesLink = new JLabel("<html><a href='#'>Link</a></html>");
        archivesLink.setBounds(150, 20, 50, 20);
        archivesLink.setForeground(Color.BLUE);
        archivesLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        accessBox.add(archivesLink);

        add(accessBox);

        JPanel chart = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(30, 90, 30, 80);
                g.fillRect(90, 110, 30, 60);
                g.fillRect(150, 70, 30, 100);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(60, 80, 30, 90);
                g.fillRect(120, 100, 30, 70);
                g.fillRect(180, 80, 30, 90);
            }
        };
        chart.setBounds(30, 150, 250, 200);
        chart.setBackground(Color.WHITE);
        add(chart);

        JLabel calendarLabel = new JLabel("October 2014");
        calendarLabel.setBounds(630, 150, 150, 20);
        add(calendarLabel);

        JPanel calendar = new JPanel(new GridLayout(0, 7));
        calendar.setBounds(630, 170, 140, 140);

        String[] days = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        for (String day : days) calendar.add(new JLabel(day, SwingConstants.CENTER));

        for (int i = 0; i < 2; i++) calendar.add(new JLabel(""));
        for (int i = 1; i <= 31; i++) {
            JLabel date = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            if (i == 24) date.setOpaque(true); date.setBackground(Color.PINK);
            calendar.add(date);
        }

        add(calendar);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeDashboardUI::new);
    }
}
