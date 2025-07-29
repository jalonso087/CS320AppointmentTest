import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    //function to add task to list
    public void addTask(Task task) {
        if(taskExists(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists");
        }
        tasks.add(task);
    }

    //function to delete task from list
    public void deleteTask(String taskId) {
        Task task = findTaskById(taskId);
        tasks.remove(task);
    }

    //function to update name
    public void updateName(String taskId, String newName) {
        Task task = findTaskById(taskId);
        task.setName(newName);
    }

    //function to update description
    public void updateDescription(String taskId, String newDescription) {
        Task task = findTaskById(taskId);
        task.setDescription(newDescription);
    }

    //find task from list using taskId variable
    private Task findTaskById(String taskId) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                return task;
            }
        }
        throw new IllegalArgumentException("Task not found");
    }

    //return bool for existing task
    private boolean taskExists(String taskId) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                return true;
            }
        }
        return false;
    }
}