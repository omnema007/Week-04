package annotationproblems.customannotationproblems.advancedlevel.rollallowedannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}
