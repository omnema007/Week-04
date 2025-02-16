package reflectionproblems.advancelevel.methodexecutiontiming;

public class SampleClass {
    public void fastMethod() {
        System.out.println("Fast method executed!");
    }

    public void slowMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Slow method executed!");
    }
}
