package annotationproblems.customannotationproblems.advancedlevel.jsonfieldannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            Map<String, String> jsonElements = new HashMap<>();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    jsonElements.put(annotation.name(), String.valueOf(field.get(obj)));
                }
            }

            StringBuilder jsonString = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
                jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
            }
            if (jsonString.length() > 1) {
                jsonString.delete(jsonString.length() - 2, jsonString.length()); // Remove trailing comma
            }
            jsonString.append("}");

            return jsonString.toString();

        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error serializing object to JSON", e);
        }
    }
}
