package reflectionproblems.advancelevel.createcustomobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapperMain {
    public static void main(String[] args) {
        Map<String, Object> personProperties = new HashMap<>();
        personProperties.put("name", "Alice");
        personProperties.put("age", 30);

        Person person = CustomObjectMapper.toObject(Person.class, personProperties);

        person.display();
    }
}
