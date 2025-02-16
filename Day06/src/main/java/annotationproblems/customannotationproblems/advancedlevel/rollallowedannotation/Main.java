package annotationproblems.customannotationproblems.advancedlevel.rollallowedannotation;

public class Main {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        System.out.println("Test with ADMIN role:");
        RoleBasedAccessControl.invokeMethodIfAuthorized(service, "adminOnlyTask", "ADMIN");

        System.out.println("\nTest with USER role:");
        RoleBasedAccessControl.invokeMethodIfAuthorized(service, "adminOnlyTask", "USER");

        System.out.println("\nAccessing general method with any role:");
        RoleBasedAccessControl.invokeMethodIfAuthorized(service, "generalTask", "USER");
    }
}
