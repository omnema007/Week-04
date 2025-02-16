package annotationproblems.exerciseproblems.customtaskinfoannotaion;

import java.lang.reflect.Method;

public class CustomAnnotation {
    public static void main(String[] args) {
        try {
            Class<TaskManager> obj = TaskManager.class;

            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo task = method.getAnnotation(TaskInfo.class);

                    // Display annotation values
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + task.priority());
                    System.out.println("Assigned To: " + task.assignedTo());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
