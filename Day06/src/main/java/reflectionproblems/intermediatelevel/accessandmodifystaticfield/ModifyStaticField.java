package reflectionproblems.intermediatelevel.accessandmodifystaticfield;
import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
        try {

            Configuration.displayKey();

            Class<?> configClass = Configuration.class;

            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true);

            apiKeyField.set(null, "NEW_API_KEY_12345");

            Configuration.displayKey();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
