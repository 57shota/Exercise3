/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Appointment;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sho
 */
public class AddAppointment extends JFrame implements ActionListener{
     
    JLabel lblHeading = new JLabel("Add Appointment");
    JTextField dayTextField = new JTextField(10);
    JTextField hourTextField = new JTextField(10);
    JTextField nameTextField = new JTextField(10);
    Font myFont = new Font("Arial", Font.BOLD, 16);
    JButton addButton = new JButton("Add"); 
     
    public void addAppointment() {
        this.setTitle("Human Resource");
        this.setSize(180, 180);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        
        this.add(lblHeading);
        this.add(new JLabel("Name"));
        this.add(nameTextField);
        this.add(new JLabel("Day"));
        this.add(dayTextField);
        this.add(new JLabel("Hour"));
        this.add(hourTextField);
        this.add(addButton);
        
        lblHeading.setFont(myFont);
        
        //register objects to actively listen for events
        addButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == addButton) {
            int day, hour;
            String name;

            day = Integer.parseInt(dayTextField.getText());
            hour = Integer.parseInt(hourTextField.getText());
            name = nameTextField.getText();

            Appointment appo = new Appointment(day, hour, name);

            JOptionPane.showMessageDialog(null, appo);
        }
        
    }
    
}

