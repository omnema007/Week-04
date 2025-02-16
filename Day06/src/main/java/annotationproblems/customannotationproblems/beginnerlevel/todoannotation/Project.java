package annotationproblems.customannotationproblems.beginnerlevel.todoannotation;

public class Project {
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void userAuth() {
        System.out.println("User authentication code...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {
        System.out.println("Database optimization code...");
    }

    @Todo(task = "Add logging functionality", assignedTo = "Charlie", priority = "LOW")
    public void addLogging() {
        System.out.println("Logging code...");
    }
}
