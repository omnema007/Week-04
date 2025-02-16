package reflectionproblems.advancelevel.dependencyinjection;

public class Client {
    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}
