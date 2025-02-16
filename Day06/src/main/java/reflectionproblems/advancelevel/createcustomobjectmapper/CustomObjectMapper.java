package reflectionproblems.advancelevel.createcustomobjectmapper;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                field.set(obj, fieldValue);
            }

            return obj;
        } catch (Exception e) {
            throw new RuntimeException("Error creating object from properties", e);
        }

    }
}
