package annotationproblems.customannotationproblems.advancedlevel.rollallowedannotation;

public class SecureService {
    @RoleAllowed("ADMIN")
    public void adminOnlyTask() {
        System.out.println("Admin-only task executed.");
    }

    public void generalTask() {
        System.out.println("General task executed.");
    }
}


