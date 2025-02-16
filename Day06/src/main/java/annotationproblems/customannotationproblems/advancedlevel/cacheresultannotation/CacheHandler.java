package annotationproblems.customannotationproblems.advancedlevel.cacheresultannotation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheHandler(Object target) {
        this.target = target;
    }

    public Object invoke(String methodName, Object... args) throws Exception {
        String key = methodName + ":" + java.util.Arrays.deepToString(args);

        if (cache.containsKey(key)) {
            System.out.println("Returning cached result for " + key);
            return cache.get(key);
        }

        Method method = target.getClass().getMethod(methodName, int.class);
        if (method.isAnnotationPresent(CacheResult.class)) {
            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}
