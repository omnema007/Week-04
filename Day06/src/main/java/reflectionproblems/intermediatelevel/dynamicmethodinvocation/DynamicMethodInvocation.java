package reflectionproblems.intermediatelevel.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class<?> cls = Class.forName("reflectionproblems.intermediatelevel.dynamicmethodinvocation.MathOperations");

            Object obj = cls.getDeclaredConstructor().newInstance();

            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            Method method = cls.getMethod(methodName, int.class, int.class);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            Object result = method.invoke(obj, num1, num2);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
