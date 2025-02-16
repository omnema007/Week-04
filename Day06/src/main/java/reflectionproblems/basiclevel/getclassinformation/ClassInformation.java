package reflectionproblems.basiclevel.getclassinformation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name (e.g., SampleClass): ");
        String className = scanner.nextLine();

        try {
            Class<?> cls = Class.forName(className);

            System.out.println("Class: " + cls.getName());

            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
