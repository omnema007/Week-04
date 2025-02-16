package annotationproblems.customannotationproblems.advancedlevel.cacheresultannotation;

public class CustomCachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations operations = new ExpensiveOperations();
        CacheHandler cacheHandler = new CacheHandler(operations);

        // First call - computes and caches the result
        System.out.println("Result: " + cacheHandler.invoke("factorial", 5));
        // Second call - returns cached result
        System.out.println("Result: " + cacheHandler.invoke("factorial", 5));
        // Another call with different input - computes again
        System.out.println("Result: " + cacheHandler.invoke("factorial", 4));
    }
}
