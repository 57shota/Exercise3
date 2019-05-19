/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Appointment;
import Utilities.InputOutput;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
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
    
    final static String fileName = "Appointment.bin";
    static ArrayList<Appointment> appos;
    
     
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
            
            appos = new ArrayList<>();
            appos = readData();
            AddAppointment addAppo = new AddAppointment();
            String text = "Appointment entered.";
            JOptionPane.showMessageDialog(null, text);
            
        }else if(ev.getSource() == searchButton) {
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
        }
    }
    
    public static ArrayList<Appointment> readData(){
        ArrayList<Appointment> appos = new ArrayList<>();
        try{
           appos = InputOutput.readAppointmentData(fileName);
        }
        catch(FileNotFoundException fnfEx){
            System.err.println("Problem with the patients.bin file");
            JOptionPane.showMessageDialog(null, "File \"Appointment.bin\" will be created");
        }
        catch(NotSerializableException nsEx){
            System.err.println("A class has not been serialised");
        }
        catch(IOException ioEx){
            System.err.println("Problem with reading data from file");
        }
   
        return appos;
    }
    
    public static void saveData(ArrayList<Appointment> appos){
        try{
            InputOutput.saveAppointmentData(fileName, appos);
        }
        catch(FileNotFoundException fnfEx){
            System.err.println("Problem with the binary file");
        }
        catch(NotSerializableException nsEx){
            System.err.println("A class has not been serialised");
        }
        catch (IOException ioEx){
            System.err.println("Issue(s) with saving data to file");
        }
        
    }
}
