package reflectionproblems.basiclevel.dynamicallycreateobject;

public class DynamicallyObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("reflectionproblems.basiclevel.dynamicallycreateobject.Student");

            Object obj = cls.getDeclaredConstructor().newInstance();

            Student student = (Student) obj;

            student.displayStudent();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
