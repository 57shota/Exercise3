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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sho
 */
public class FrontEnd extends JFrame implements ActionListener{
     
    JLabel headingLabel = new JLabel("Meeting Calender");
    Font myFont = new Font("Arial", Font.BOLD, 24);
    JLabel descLabel = new JLabel("Enter or search appointment");
    JButton helpButton = new JButton("Help"); 
    JButton addButton = new JButton("Add Appointment"); 
    JButton searchButton = new JButton("Search Appointment"); 
    
     
    public void addAppointment() {
        this.setTitle("Meeting Calendar");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        
        this.add(headingLabel);
        this.add(descLabel);
        this.add(helpButton);
        this.add(addButton);
        this.add(searchButton);
        
        headingLabel.setFont(myFont);
        
        //register objects to actively listen for events
        helpButton.addActionListener(this);
        addButton.addActionListener(this);
        searchButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == helpButton) {
            
            String text = "HELP INFORMATION\n\n"
                        + "The meeting calendar app saves your appointment to file for the current month.\n\n"
                        + "Click \"Add Appointment\" to add the clients name, day and hour of the appointment\n\n"
                        + "Click \"Search Appointment\" to see a list of all the appointments for the month\n\n";
           
            JOptionPane.showMessageDialog(null, text);
            
        }else if(ev.getSource() == addButton) {
//             int day, hour;
//            String name;
//
//            day = Integer.parseInt(dayTextField.getText());
//            hour = Integer.parseInt(hourTextField.getText());
//            name = nameTextField.getText();
//
//            Appointment appo = new Appointment(day, hour, name);
//
//            JOptionPane.showMessageDialog(null, appo);
        }else if(ev.getSource() == searchButton) {
            
        }
        
        
        
    }
}
