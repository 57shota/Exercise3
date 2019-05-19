package Utilities;

import Classes.Appointment;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author sho
 */
public class InputOutput {
    public static ArrayList<Appointment> readAppointmentData(String file) throws FileNotFoundException, IOException{
        
        ArrayList<Appointment> list = new ArrayList<>();
        FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);
        Appointment appo;
        
        while(din.available() > 0) { 
            appo = new Appointment(din.readInt(), din.readInt(), din.readUTF());
            list.add(appo);
        }
        return list;
    }

    public static void saveAppointmentData(String file, ArrayList<Appointment> list) throws FileNotFoundException, IOException{
        
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        
        for(Appointment appo: list){
            dos.writeInt(appo.getDay());
            dos.writeInt(appo.getHour());
            dos.writeUTF(appo.getName());
        }
        dos.close();
    }
}
