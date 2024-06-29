package quiz.applicationcs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JButton back, start;
    JLabel name;
    JTextField tfname;

    login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Use an empty ImageIcon
        ImageIcon i1 = new ImageIcon();
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Serif", Font.BOLD, 40));  // Using a more common font
        add(heading);

        name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Serif", Font.BOLD, 18));  // Using a more common font
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Serif", Font.BOLD, 20));  // Using a more common font
        add(tfname);

        start = new JButton("Start");
        start.setBounds(735, 270, 120, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            String name = tfname.getText();
            setVisible(false);
            new Quiz(name);  // Ensure the Quiz class exists and is properly defined
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}

