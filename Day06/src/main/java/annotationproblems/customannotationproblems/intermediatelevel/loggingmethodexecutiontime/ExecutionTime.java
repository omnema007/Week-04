package annotationproblems.customannotationproblems.intermediatelevel.loggingmethodexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTime {
    public static void main(String[] args) {
        try {
            PerformanceTest test = new PerformanceTest();
            Method[] methods = PerformanceTest.class.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long start = System.nanoTime();
                    method.invoke(test);
                    long end = System.nanoTime();
                    System.out.println("Execution time of " + method.getName() + ": " + (end - start) + " nanoseconds\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
