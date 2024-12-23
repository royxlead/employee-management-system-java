package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class() {
        setTitle("Employee Management System");
        setSize(480, 500);
        setLocation(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Background Image
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(backgroundImage);
        JLabel backgroundLabel = new JLabel(scaledIcon);
        setContentPane(backgroundLabel);
        backgroundLabel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        // Heading
        JLabel heading = new JLabel("Employee Management System");
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);
        gbc.gridy = 0;
        backgroundLabel.add(heading, gbc);

        // Add Employee Button
        JButton add = new JButton("Add Employee");
        add.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        gbc.gridy = 1;
        backgroundLabel.add(add, gbc);

        // View Employee Button
        JButton view = new JButton("View Employee");
        view.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLACK);
        gbc.gridy = 2;
        backgroundLabel.add(view, gbc);

        // Remove Employee Button
        JButton remove = new JButton("Remove Employee");
        remove.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        remove.setForeground(Color.WHITE);
        remove.setBackground(Color.BLACK);
        gbc.gridy = 3;
        backgroundLabel.add(remove, gbc);

        // Button Actions
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                setVisible(false);
            }
        });

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
