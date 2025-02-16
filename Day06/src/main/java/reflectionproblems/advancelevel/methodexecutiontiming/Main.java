package reflectionproblems.advancelevel.methodexecutiontiming;

public class Main {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();

        MethodExecutionTimer.measureExecutionTime(sample, "fastMethod");
        MethodExecutionTimer.measureExecutionTime(sample, "slowMethod");
    }
}
