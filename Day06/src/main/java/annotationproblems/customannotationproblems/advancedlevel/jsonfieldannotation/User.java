package annotationproblems.customannotationproblems.advancedlevel.jsonfieldannotation;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
