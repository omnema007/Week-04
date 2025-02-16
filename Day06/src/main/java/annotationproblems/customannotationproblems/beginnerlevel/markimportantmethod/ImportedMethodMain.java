package annotationproblems.customannotationproblems.beginnerlevel.markimportantmethod;

import java.lang.reflect.Method;

public class ImportedMethodMain {
    public static void main(String[] args) {
        try {
            Class<Service> obj = Service.class;

            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
