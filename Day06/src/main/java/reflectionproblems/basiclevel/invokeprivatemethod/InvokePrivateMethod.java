package reflectionproblems.basiclevel.invokeprivatemethod;
import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();

            Class<?> cls = calc.getClass();

            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);

            multiplyMethod.setAccessible(true);

            int result = (int) multiplyMethod.invoke(calc, 5, 7);

            System.out.println("Result of multiply(5, 7): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
