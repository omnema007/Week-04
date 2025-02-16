package reflectionproblems.advancelevel.methodexecutiontiming;
import java.lang.reflect.Method;
public class MethodExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            // Get the method from the object's class
            Method method = obj.getClass().getMethod(methodName);

            // Measure start time
            long startTime = System.nanoTime();

            // Invoke the method
            method.invoke(obj);

            // Measure end time
            long endTime = System.nanoTime();

            // Calculate and display the execution time
            long duration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds
            System.out.println("Execution time of " + methodName + ": " + duration + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
