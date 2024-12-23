package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField tfname, taddress, tphone, taadhar, temail, tsalary, tdesignation, teducation;
    JLabel tempId, tnameLabel, tdobLabel, taadharLabel;
    JButton update, back;
    String num;

    UpdateEmployee(String num) {
        this.num = num;
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Heading
        JLabel heading = new JLabel("UPDATE EMPLOYEE DETAILS");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Span the entire width
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER; // Center the heading
        add(heading, gbc);

        // Name Label and TextField
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        name.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Left align label
        add(name, gbc);

        tnameLabel = new JLabel();
        tnameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tnameLabel.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Left align text field
        add(tnameLabel, gbc);

        // Father's Name Label and TextField
        JLabel fname = new JLabel("Father's Name");
        fname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        fname.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(fname, gbc);

        tfname = new JTextField(20);
        tfname.setBackground(Color.WHITE);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tfname.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(tfname, gbc);

        // DOB Label and DateChooser
        JLabel dob = new JLabel("Date Of Birth");
        dob.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        dob.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(dob, gbc);

        tdobLabel = new JLabel();
        tdobLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tdobLabel.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(tdobLabel, gbc);

        // Salary Label and TextField
        JLabel salary = new JLabel("Salary");
        salary.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        salary.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(salary, gbc);

        tsalary = new JTextField(20);
        tsalary.setBackground(Color.WHITE);
        tsalary.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tsalary.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(tsalary, gbc);

        // Address Label and TextField
        JLabel address = new JLabel("Address");
        address.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        address.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(address, gbc);

        taddress = new JTextField(20);
        taddress.setBackground(Color.WHITE);
        taddress.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        taddress.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(taddress, gbc);

        // Phone Label and TextField
        JLabel phone = new JLabel("Phone Number");
        phone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        phone.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(phone, gbc);

        tphone = new JTextField(20);
        tphone.setBackground(Color.WHITE);
        tphone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tphone.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(tphone, gbc);

        // Email Label and TextField
        JLabel email = new JLabel("Email ID");
        email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        email.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(email, gbc);

        temail = new JTextField(20);
        temail.setBackground(Color.WHITE);
        temail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        temail.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(temail, gbc);

        // Education Label and TextField
        JLabel education = new JLabel("Highest Qualification");
        education.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        education.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 8;
        add(education, gbc);

        teducation = new JTextField(20);
        teducation.setBackground(Color.WHITE);
        teducation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        teducation.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 8;
        add(teducation, gbc);

        // Aadhar Label and TextField
        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        aadhar.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 9;
        add(aadhar, gbc);

        taadharLabel = new JLabel();
        taadharLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        taadharLabel.setForeground(new Color(33, 37, 41));
        gbc.gridx = 1;
        gbc.gridy = 9;
        add(taadharLabel, gbc);

        // Designation Label and TextField
        JLabel designation = new JLabel("Designation");
        designation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        designation.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 10;
        add(designation, gbc);

        tdesignation = new JTextField(20);
        tdesignation.setBackground(Color.WHITE);
        tdesignation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tdesignation.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 10;
        add(tdesignation, gbc);

        // Employee ID Label and Display
        JLabel empId = new JLabel("Employee ID");
        empId.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        empId.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 11;
        add(empId, gbc);

        tempId = new JLabel();
        tempId.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tempId.setForeground(new Color(58, 115, 220));
        gbc.gridx = 1;
        gbc.gridy = 11;
        add(tempId, gbc);

        // Update and Back Buttons
        update = new JButton("Update");
        update.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 2; // Span across two columns
        gbc.anchor = GridBagConstraints.CENTER; // Center the buttons
        add(update, gbc);

        back = new JButton("Back");
        back.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 12;
        add(back, gbc);

        update.addActionListener(this);
        back.addActionListener(this);

        // Frame settings
        setTitle("Update Employee");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Load existing employee data
        loadEmployeeData();
    }

    private void loadEmployeeData() {
        try {
            conn c = new conn();
            String query = "SELECT * FROM employee WHERE empId = '" + num + "'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()) {
                tnameLabel.setText(resultSet.getString("name"));
                tfname.setText(resultSet.getString("fname"));
                tdobLabel.setText(resultSet.getString("dob"));
                taddress.setText(resultSet.getString("address"));
                tsalary.setText(resultSet.getString("salary"));
                tphone.setText(resultSet.getString("phone"));
                temail.setText(resultSet.getString("email"));
                teducation.setText(resultSet.getString("education"));
                taadharLabel.setText(resultSet.getString("aadhar"));
                tempId.setText(resultSet.getString("empId"));
                tdesignation.setText(resultSet.getString("designation"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update) {
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = teducation.getText();
            String designation = tdesignation.getText();

            try {
                conn c = new conn();
                String query = "UPDATE employee SET fname = '" + fname + "', salary = '" + salary + "', address = '" + address + "', phone = '" + phone + "', email = '" + email + "', education = '" + education + "', designation = '" + designation + "' WHERE empId = '" + num + "'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Main_class();
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}
