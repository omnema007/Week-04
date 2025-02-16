package annotationproblems.exerciseproblems.deprecatedannotation;

public class DeprecatedMain {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();

        api.newFeature();
    }
}
