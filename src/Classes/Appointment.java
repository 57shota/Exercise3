package Classes;

/**
 *
 * @author sho
 */
public class Appointment {
    
    private int day;
    private int hour;
    private String name;

    public Appointment(int day, int hour, String name) {
        this.day = day;
        this.hour = hour;
        this.name = name;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Appointment{" + "day=" + day + ", hour=" + hour + ", name=" + name + '}';
    }
}
