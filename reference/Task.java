public class Task {
    public static String taskId;
    public String name;
    public String description;

    public Task(String taskId, String name, String description) {
        //check for invalid values mentioned in requirements
        if (taskId == null || taskId.length() > 10) {
            throw new IllegalArgumentException("Invalid task ID");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }

        //assign each constructor var to class var
        this.taskId = taskId;
        this.name = name;
        this.description = description;

    }

    //getters
    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    //setters -- re-checking for null and invalid values where needed
    //setName
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name");
        }

        this.name = name;
    }
    //setDescription
    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }

        this.description = description;
    }


}