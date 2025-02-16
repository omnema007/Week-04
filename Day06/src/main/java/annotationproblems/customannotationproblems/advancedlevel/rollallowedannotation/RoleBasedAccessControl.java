package annotationproblems.customannotationproblems.advancedlevel.rollallowedannotation;

import java.lang.reflect.Method;

public class RoleBasedAccessControl {

    // Method to simulate checking user role
    public static void invokeMethodIfAuthorized(Object obj, String methodName, String userRole) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!roleAllowed.value().equals(userRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
