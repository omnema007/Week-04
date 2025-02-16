package annotationproblems.customannotationproblems.intermediatelevel.maxlengthannotation;

public class MaxLengthAnnotation {
    public static void main(String[] args) {
        try {
            User user1 = new User("ShortName");
            System.out.println("User created: " + user1.getUsername());

            // This will throw an exception
            User user2 = new User("VeryLongUsername");
            System.out.println("User created: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
