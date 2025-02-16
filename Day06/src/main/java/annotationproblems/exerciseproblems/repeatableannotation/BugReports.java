package annotationproblems.exerciseproblems.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Container annotation for holding multiple BugReports
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}
