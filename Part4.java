import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Part4 {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create Panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);  // Using absolute layout

        // Name Label & Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 80, 25);
        nameLabel.setForeground(Color.WHITE);
        panel.add(nameLabel);

        JTextField nameText = new JTextField();
        nameText.setBounds(150, 30, 165, 25);
        nameText.setBackground(Color.DARK_GRAY);
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 70, 80, 25);
        emailLabel.setForeground(Color.WHITE);
        panel.add(emailLabel);

        JTextField emailText = new JTextField();
        emailText.setBounds(150, 70, 165, 25);
        emailText.setBackground(Color.DARK_GRAY);
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 80, 25);
        passwordLabel.setForeground(Color.WHITE);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 110, 165, 25);
        passwordText.setBackground(Color.DARK_GRAY);
        passwordText.setForeground(Color.WHITE);
        panel.add(passwordText);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 80, 25);
        genderLabel.setForeground(Color.WHITE);
        panel.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 150, 70, 25);
        male.setBackground(Color.BLACK);
        male.setForeground(Color.WHITE);
        panel.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 150, 80, 25);
        female.setBackground(Color.BLACK);
        female.setForeground(Color.WHITE);
        panel.add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Interests
        JLabel interestLabel = new JLabel("Interests:");
        interestLabel.setBounds(50, 190, 80, 25);
        interestLabel.setForeground(Color.WHITE);
        panel.add(interestLabel);

        JCheckBox javaBox = new JCheckBox("Java");
        javaBox.setBounds(150, 190, 60, 25);
        javaBox.setBackground(Color.BLACK);
        javaBox.setForeground(Color.WHITE);
        panel.add(javaBox);

        JCheckBox pythonBox = new JCheckBox("Python");
        pythonBox.setBounds(210, 190, 70, 25);
        pythonBox.setBackground(Color.BLACK);
        pythonBox.setForeground(Color.WHITE);
        panel.add(pythonBox);

        JCheckBox cppBox = new JCheckBox("C++");
        cppBox.setBounds(280, 190, 60, 25);
        cppBox.setBackground(Color.BLACK);
        cppBox.setForeground(Color.WHITE);
        panel.add(cppBox);
        
     // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 240, 100, 30);
        panel.add(submitButton);

     // Submit Button Action
        submitButton.addActionListener(e -> {
        	
            String name = nameText.getText();
            String email = emailText.getText();
            String password = new String(passwordText.getPassword());

            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not selected");

            StringBuilder interests = new StringBuilder();
            if (javaBox.isSelected()) interests.append("Java ");
            if (pythonBox.isSelected()) interests.append("Python ");
            if (cppBox.isSelected()) interests.append("C++ ");
            if (interests.length() == 0) interests.append("None");

            String message = 
            	    "Name: " + name + "\n" +
            	    "Email: " + email + "\n" +
            	    "Password: " + password + "\n" +		
            	    "Gender: " + gender + "\n" +
            	    "Interests: " + interests.toString();


            JOptionPane.showMessageDialog(frame, message, "Submitted Data", JOptionPane.INFORMATION_MESSAGE);
        });
        
        // Finalize Frame
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Center screen
        frame.setVisible(true);
    }
}
