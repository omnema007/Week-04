package reflectionproblems.advancelevel.customloggingproxy;

public class GreetingImpl implements Greetings {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
