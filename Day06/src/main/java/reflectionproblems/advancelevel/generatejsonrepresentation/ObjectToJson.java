package reflectionproblems.advancelevel.generatejsonrepresentation;
import java.lang.reflect.Field;
public class ObjectToJson {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        try {
            Class<?> objClass = obj.getClass();
            Field[] fields = objClass.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);  // Make private fields accessible

                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                json.append("\"").append(fieldName).append("\": ");

                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        json.append("}");
        return json.toString();
    }
}
