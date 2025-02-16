package reflectionproblems.basiclevel.accessprivatefield;
import java.lang.reflect.Field;

public class AcessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            System.out.println("Before modification:");
            person.displayAge();

            Class<?> cls = person.getClass();

            Field ageField = cls.getDeclaredField("age");

            ageField.setAccessible(true);

            ageField.set(person, 30);

            int modifiedAge = (int) ageField.get(person);

            System.out.println("\nAfter modification:");
            person.displayAge();
            System.out.println("Modified age retrieved using Reflection: " + modifiedAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
