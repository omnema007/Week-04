package reflectionproblems.advancelevel.dependencyinjection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public DIContainer() {
        // Register dependencies
        instances.put(Service.class, new ServiceImpl());
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T obj = createInstance(clazz);
        injectDependencies(obj);
        return obj;
    }

    private <T> T createInstance(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    private void injectDependencies(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, instances.get(field.getType()));
            }
        }
    }
}
