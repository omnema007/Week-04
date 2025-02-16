package annotationproblems.exerciseproblems.repeatableannotation;

import java.lang.reflect.Method;

public class RepeatableAnnotation {
    public static void main(String[] args) {
        try {
            // Get the class object
            Class<SoftwareModule> obj = SoftwareModule.class;

            // Get the method with the bug reports
            Method method = obj.getMethod("processTask");

            // Check for multiple BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports reports = method.getAnnotation(BugReports.class);

                for (BugReport report : reports.value()) {
                    System.out.println("Bug Report: " + report.description());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
