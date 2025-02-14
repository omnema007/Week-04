package exceptionhandling.exceptionpropagation;

public class ExceptionPropagation {
    public static void method1() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void method2() throws ArithmeticException {
        method1();
    }
}
