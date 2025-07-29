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


}
