import java.util.Date;

public class Appointment {

    //members
    public static String appointmentId;
    public Date appointmentDate;
    public String description;

    public Appointment(String appointmentId, Date appointmentDate, String description) {

        //Appointment date shall not be null or greater than 10 characters
        if(appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("Invalid appointment ID.");
        }

        //Appointment date shall not be null or in the past
        if(appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid appointment date.");
        }

        //Description field shall not be null or greater than 50 characters
        if(description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description.");
        }

        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    //getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String description() {
        return description;
    }

    //setters
    public void setAppointmentDate(Date appointmentDate) {

        //verify not in the past
        if(appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid appointment date.");
        }

        this.appointmentDate = appointmentDate;
    }

    public void setDescription(String description) {

        //verify less than 50 characters
        if(description.length() > 50) {
            throw new IllegalArgumentException("Invalid description.");
        }

        this.description = description;
    }

}
