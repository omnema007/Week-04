package annotationproblems.exerciseproblems.overrideannotation;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

}
