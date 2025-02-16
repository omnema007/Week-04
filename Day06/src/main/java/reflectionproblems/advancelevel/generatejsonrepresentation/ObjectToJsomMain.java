package reflectionproblems.advancelevel.generatejsonrepresentation;

public class ObjectToJsomMain {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "New York");
        String json = ObjectToJson.toJson(person);
        System.out.println(json);
    }
}
