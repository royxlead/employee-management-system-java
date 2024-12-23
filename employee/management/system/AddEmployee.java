package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    Random rand = new Random();
    int num = rand.nextInt(999999);

    JTextField tname, tfname, taddress, tphone, taadhar, temail, tsalary, tdesignation;
    JLabel tempId;
    JDateChooser tdob;
    JButton add, back;
    JComboBox<String> Boxeducation;

    AddEmployee() {
        // Set a modern, clean background color
        getContentPane().setBackground(new Color(173, 216, 230));

        // Set layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Heading
        JLabel heading = new JLabel("ADD EMPLOYEE DETAILS");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Span the entire width
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER; // Center the heading
        add(heading, gbc);

        // Add a blank space between heading and the first label
        gbc.insets = new Insets(20, 10, 10, 10); // Increase top padding
        gbc.gridy = 1;

        // Name Label and TextField
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        name.setForeground(new Color(33, 37, 41));
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Left align label
        add(name, gbc);

        tname = new JTextField(20);
        tname.setBackground(Color.WHITE);
        tname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tname.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Left align text field
        add(tname, gbc);

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

        tdob = new JDateChooser();
        tdob.setPreferredSize(new Dimension(250, 30)); // Widened DateChooser
        tdob.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        tdob.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(tdob, gbc);

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

        // Education Label and ComboBox
        JLabel education = new JLabel("Highest Qualification");
        education.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        education.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 8;
        add(education, gbc);

        String[] degree = {"PHD", "M.Tech", "B.Tech", "MSC", "BSC", "MCA", "BCA", "MBA", "BBA", "M.COM", "B.COM", "MA", "BA"};
        Boxeducation = new JComboBox<>(degree);
        Boxeducation.setBackground(Color.WHITE);
        Boxeducation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        Boxeducation.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 8;
        add(Boxeducation, gbc);

        // Aadhar Label and TextField
        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        aadhar.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 9;
        add(aadhar, gbc);

        taadhar = new JTextField(20);
        taadhar.setBackground(Color.WHITE);
        taadhar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        taadhar.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        gbc.gridx = 1;
        gbc.gridy = 9;
        add(taadhar, gbc);

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

        // Employee ID Label and Auto-generated ID
        JLabel empId = new JLabel("Employee ID");
        empId.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        empId.setForeground(new Color(33, 37, 41));
        gbc.gridx = 0;
        gbc.gridy = 11;
        add(empId, gbc);

        tempId = new JLabel("" + num);
        tempId.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tempId.setForeground(new Color(58, 115, 220));
        gbc.gridx = 1;
        gbc.gridy = 11;
        add(tempId, gbc);

        // Add and Back Buttons
        add = new JButton("Add");
        add.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 2; // Span across two columns
        gbc.anchor = GridBagConstraints.CENTER; // Center the buttons
        add(add, gbc);

        back = new JButton("Back");
        back.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 12;
        add(back, gbc);

        add.addActionListener(this);
        back.addActionListener(this);

        // Frame settings
        setTitle("Add Employee");
        setSize(600, 780);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String aadhar = taadhar.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = (String) Boxeducation.getSelectedItem();
            String designation = tdesignation.getText();
            String empId = tempId.getText();

            try {
                conn c = new conn();
                String query = "INSERT INTO employee VALUES('" + name + "','" + fname + "','" + dob + "','" + salary + "','" + address + "','" + phone + "','" + email + "','" + education + "','" + designation + "','" + aadhar + "','" + empId + "')";

                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);

                new Main_class();
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
