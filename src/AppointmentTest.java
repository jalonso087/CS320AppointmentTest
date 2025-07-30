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

    //verify null description throws exception
    @Test
    void testAppointmentDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("2", null, "Descrip.");
        });
    }

    //verify incorrect data type for appointmentDate throws exception
    @Test
    void testAppointmentDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123456789012", new Date(), "Describe");
        });
    }

}
