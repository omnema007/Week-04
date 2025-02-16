package annotationproblems.exerciseproblems.customtaskinfoannotaion;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}
