package annotationproblems.exerciseproblems.repeatableannotation;

public class SoftwareModule {
    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Memory leak when running for long hours")
    public void processTask() {
        System.out.println("Processing task...");
    }
}
