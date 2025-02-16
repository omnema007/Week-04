package annotationproblems.customannotationproblems.intermediatelevel.loggingmethodexecutiontime;

public class PerformanceTest {
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {

        }
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++) {

        }
        System.out.println("Slow method executed.");
    }
}
