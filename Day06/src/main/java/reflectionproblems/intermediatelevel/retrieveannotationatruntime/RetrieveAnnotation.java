package reflectionproblems.intermediatelevel.retrieveannotationatruntime;

public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> bookClass = Class.forName("reflectionproblems.intermediatelevel.retrieveannotationatruntime.Book");

            if (bookClass.isAnnotationPresent(Author.class)) {
                Author author = bookClass.getAnnotation(Author.class);

                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
