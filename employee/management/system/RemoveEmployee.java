package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {
    Choice choiceEMPID;
    JButton delete, back;
    JLabel textName, textPhone, textEmail;

    RemoveEmployee() {
        setTitle("Remove Employee");
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding
        gbc.anchor = GridBagConstraints.WEST;

        // Heading
        JLabel heading = new JLabel("Remove Employee");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Span the entire width
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        add(heading, gbc);

        // Employee ID Label and Choice
        JLabel label = new JLabel("Employee ID");
        label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label, gbc);

        choiceEMPID = new Choice();
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(choiceEMPID, gbc);

        // Name Label
        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelName.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(labelName, gbc);

        textName = new JLabel();
        textName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textName.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(textName, gbc);

        // Phone Label
        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelPhone.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(labelPhone, gbc);

        textPhone = new JLabel();
        textPhone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textPhone.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(textPhone, gbc);

        // Email Label
        JLabel labelemail = new JLabel("Email");
        labelemail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelemail.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(labelemail, gbc);

        textEmail = new JLabel();
        textEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textEmail.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(textEmail, gbc);

        // Buttons
        delete = new JButton("Delete");
        delete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1; // Reset gridwidth
        gbc.anchor = GridBagConstraints.CENTER;
        add(delete, gbc);

        back = new JButton("Back");
        back.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(back, gbc);

        delete.addActionListener(this);
        back.addActionListener(this);

        // Load employee IDs
        loadEmployeeIds();

        // Display settings
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Update employee details when the selected item changes
        choiceEMPID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateEmployeeDetails();
            }
        });
    }

    private void loadEmployeeIds() {
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("SELECT empId FROM employee");
            while (resultSet.next()) {
                choiceEMPID.add(resultSet.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateEmployeeDetails() {
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM employee WHERE empId = '" + choiceEMPID.getSelectedItem() + "'");
            while (resultSet.next()) {
                textName.setText(resultSet.getString("name"));
                textPhone.setText(resultSet.getString("phone"));
                textEmail.setText(resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delete) {
            try {
                conn c = new conn();
                String query = "DELETE FROM employee WHERE empId = '" + choiceEMPID.getSelectedItem() + "'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Deleted Successfully");
                setVisible(false);
                new Main_class();
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == back) {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
