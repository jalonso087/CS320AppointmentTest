//Author Name: Javier Alonso
//Date: 8/5/25
//Course ID: CS320
//Description: Appointment service class with ArrayList as container for appointments and
//  methods for appointment modifications

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class AppointmentService {

    private final List<Appointment> appointments = new ArrayList<>();

    //method to add appointment to list
    public void addAppointment(Appointment appointment) {
        if (appointmentExists(appointment.getAppointmentId())) {
            throw new IllegalArgumentException("Appointment already exists.");
        }

        appointments.add(appointment);
    }

    //method to delete appointment from list
    public void deleteAppointment(String appointmentId) {
        Appointment appointment = findAppointmentById(appointmentId);
        appointments.remove(appointment);
    }

    //method to update appointment date
    public void updateAppointmentDate(String appointmentId, Date appointmentDate) {

        Appointment appointment = findAppointmentById(appointmentId);
        appointment.setAppointmentDate(appointmentDate);

    }

    //method to update description
    public void updateDescription(String appointmentId, String description) {

        Appointment appointment = findAppointmentById(appointmentId);
        appointment.setDescription(description);

    }

    //find appointment from ArrayList using appointmentId var
    private Appointment findAppointmentById(String appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                return appointment;
            }
        }
        throw new IllegalArgumentException("Appointment not found.");
    }

    //return boolean for existing appointment
    private boolean appointmentExists(String appointmentId) {
        for (Appointment appointment : appointments) {
            if(appointment.getAppointmentId().equals(appointmentId)) {
                return true;
            }
        }

        return false;

    }


}
