//Author Name: Javier Alonso
//Date: 8/5/25
//Course ID: CS320
//Description: Unit tests for the appointment class.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class AppointmentTest {

    //verify ability to create new appointment
    @Test
    void testAppointmentCreation() {
        Appointment appointment = new Appointment("1", new Date() , "Description");
        assertEquals("1", appointment.getAppointmentId());
    }

    //R1 verify appointment must not be null
    @Test
    void testAppointmentNull() {
        Appointment appt1 = new Appointment("1", new Date(), "1.");
        assertThrows(IllegalArgumentException.class, () -> {
            Appointment appt2 = new Appointment(null, new Date(), "2");
        });
    }

    //R3 = verify null description throws exception
    @Test
    void testAppointmentDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("2", new Date(), null);
        });
    }

    //R3 = verify description length > 50 throws exception
    @Test
    void testAppointmentDescriptionLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("3", new Date(), "123456789012345678901234567890123456789012345678901");
        });
    }

    //R2 = verify null appointmentDate throws exception
    @Test
    void testAppointmentDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123456789012", null, "Describe");
        });
    }

    //R2 = verify date cannot be in the past
    @Test
    void testAppointmentDatePast() {
        Appointment appt = new Appointment("5", new Date(), "Date in the Past");
        assertEquals(new Date(), appt.getAppointmentDate());
    }

}
