import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class TaskServiceTest {

    //verify add task
    @Test
    public void testAddTaskSuccess() {
        TaskService service = new TaskService();
        Task task = new Task("1", "James", "Memo field");
        service.addTask(task);
        service.updateName("1", "Jones");
        assertEquals("Jones", task.getName());
    }

    //verify duplicate task throws exception
    @Test
    public void testAddDuplicateTaskThrows() {
        TaskService service = new TaskService();
        Task task1 = new Task("001", "Bob", "Memo");
        Task task2 = new Task("001", "Jones", "Desc");
        service.addTask(task1);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addTask(task2);
        });
    }

    //verify ability to delete task
    @Test
    public void testDeleteTaskSuccess() {
        TaskService service = new TaskService();
        Task task = new Task("10", "Sammy", "Desc field");
        service.addTask(task);
        service.deleteTask("10");
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateName("10", "Sandra");
        });
    }
}