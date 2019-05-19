/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
    JTextField txfID = new JTextField(10);
    JTextField txfFirst = new JTextField(10);
    JTextField txfLast = new JTextField(10);
    Font myFont = new Font("Arial", Font.BOLD, 16);
    JButton btnRegister = new JButton("Add"); 
     
    public addAppointment() {
        this.setTitle("Human Resource");
        this.setSize(230, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        
        this.add(lblHeading);
        this.add(new JLabel("Employee ID"));
        this.add(txfID);
        this.add(new JLabel("First Name"));
        this.add(txfFirst);
        this.add(new JLabel("Last Name"));
        this.add(txfLast);
        this.add(btnRegister);
        
        lblHeading.setFont(myFont);
        
        //register objects to actively listen for events
        btnRegister.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == btnRegister) {
            String first, last;
            int id;

            id = Integer.parseInt(txfID.getText());
            first = txfFirst.getText();
            last = txfLast.getText();

            Appointment appo = new Appointment

            JOptionPane.showMessageDialog(null, emp);
        }
        if(ev.getSource() == btnClear){
            txfID.setText("");
            txfFirst.setText("");
            txfLast.setText("");
        }
    }
    
}

