//Author Name: Javier Alonso
//Date: 8/5/25
//Course ID: CS320
//Description: Unit tests for the appointment service class.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;


public class AppointmentServiceTest {

    //verify add appointment
    @Test
    public void testAddAppointmentSuccess() {
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("1", new Date(), "Memo field");
        appointmentService.addAppointment(appointment);
        appointmentService.updateDescription("1", "Description");
        assertEquals("Description", appointment.getDescription());
    }

    //verify duplicate appointment throws exception
    @Test
    public void testAddDuplicateAppointmentThrows() {
        AppointmentService service = new AppointmentService();
        Appointment appt1 = new Appointment("1", new Date(), "Description");
        Appointment appt2 = new Appointment("1", new Date(), "Description");
        service.addAppointment(appt1);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(appt2);
        });
    }

    //verify ability to delete appointment
    @Test
    public void testDeleteAppointmentSuccess() {
        AppointmentService service = new AppointmentService();
        Appointment appt = new Appointment("3", new Date(), "Description field.");
        service.addAppointment(appt);
        service.deleteAppointment("3");
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateDescription("3", "Memo Test.");
        });
    }

}
