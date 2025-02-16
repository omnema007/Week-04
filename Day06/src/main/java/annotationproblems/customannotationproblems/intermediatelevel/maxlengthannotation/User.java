package annotationproblems.customannotationproblems.intermediatelevel.maxlengthannotation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;
        validateMaxLength(this);
    }

    private void validateMaxLength(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value.length() > maxLength.value()) {
                        throw new IllegalArgumentException(
                                "Field " + field.getName() + " exceeds max length of " + maxLength.value());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}
