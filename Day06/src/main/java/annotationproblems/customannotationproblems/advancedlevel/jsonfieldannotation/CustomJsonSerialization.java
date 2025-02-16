package annotationproblems.customannotationproblems.advancedlevel.jsonfieldannotation;

public class CustomJsonSerialization {
    public static void main(String[] args) {
        User user = new User("john_doe", "john@example.com", 25);
        String jsonOutput = JsonSerializer.toJson(user);
        System.out.println(jsonOutput);
    }
}
