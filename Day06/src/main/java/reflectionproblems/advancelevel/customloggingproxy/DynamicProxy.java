package reflectionproblems.advancelevel.customloggingproxy;
import java.lang.reflect.Proxy;
public class DynamicProxy {
    public static void main(String[] args) {
            // Create the real object
            Greetings greeting = new GreetingImpl();

            // Create the dynamic proxy
            Greetings proxyInstance = (Greetings) Proxy.newProxyInstance(
                    Greetings.class.getClassLoader(),
                    new Class[]{Greetings.class},
                    new LoggingHandler(greeting)
            );

            // Call method on proxy instance
            proxyInstance.sayHello("Alice");
    }
}
