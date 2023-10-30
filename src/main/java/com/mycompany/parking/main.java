package com.mycompany.parking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
    
    private JLabel Username, Password;
    private JTextField UsernameField;
    private JPasswordField PasswordField;
    private JButton Exit;
    private ExitField Exit1;
    private JButton Login = new JButton("Log In");

    public main(){
        super("Parking System 1.0 (alpha)");
        Username = new JLabel("Username", SwingConstants.CENTER);
        Password = new JLabel("Password", SwingConstants.CENTER);
        UsernameField = new JTextField(10);
        PasswordField = new JPasswordField(10);
        Exit = new JButton("Exit");
        Exit1 = new ExitField();
        Exit.addActionListener(Exit1);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3,3,3,3));
        pane.add(Username);
        pane.add(UsernameField);
        pane.add(Password);
        pane.add(PasswordField);
        pane.add(Login);
        pane.add(Exit);
        setSize(350,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Login();
    }


    public void Login(){
        Login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String Username = UsernameField.getText();
                String Password = PasswordField.getText();

                if (Username.trim().equals("username") && Password.equals("password")){
                    VehicleArrange slots = new VehicleArrange();
                    slots.setVisible(true);
                    dispose();
                }

                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    System.exit(0);
                }
            }
        });
    }
    
    private class ExitField implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        main Parking = new main();
    }
}



