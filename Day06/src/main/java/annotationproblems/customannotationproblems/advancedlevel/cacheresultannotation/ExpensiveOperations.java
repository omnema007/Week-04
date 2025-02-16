package annotationproblems.customannotationproblems.advancedlevel.cacheresultannotation;

public class ExpensiveOperations {
    public int factorial(int number) {
        System.out.println("Calculating factorial of " + number);
        if (number <= 1) return 1;
        return number * factorial(number - 1);
    }
}
