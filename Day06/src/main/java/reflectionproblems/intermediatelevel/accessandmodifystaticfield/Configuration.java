package reflectionproblems.intermediatelevel.accessandmodifystaticfield;

public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static void displayKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}
