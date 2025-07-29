import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest{

    //verify ability to create new Task
    @Test
    void testTaskCreation() {
        Task task = new Task("12345", "John", "Task Create Test");
        assertEquals("John", task.getName());
    }

    //verify null name throws exception
    @Test
    void testNullNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("123", null, "Description");
        });
    }

    //verify description length invalid
    @Test
    void testSetDescriptionInvalidLengthThrows() {
        Task task = new Task("1234", "Alice", "2345678901");
        assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription("123456789012345678901234567890123456789012345678901");
        });
    }

}