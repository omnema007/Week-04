package reflectionproblems.advancelevel.dependencyinjection;

public class DIExample {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        Client client = container.getInstance(Client.class);
        client.doWork();
    }
}
