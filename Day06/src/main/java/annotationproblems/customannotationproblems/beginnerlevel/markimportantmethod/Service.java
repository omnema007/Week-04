package annotationproblems.customannotationproblems.beginnerlevel.markimportantmethod;

public class Service {
    @ImportantMethod(level = "CRITICAL")
    public void startService() {
        System.out.println("Service started");
    }

    @ImportantMethod
    public void stopService() {
        System.out.println("Service stopped");
    }

    public void restartService() {
        System.out.println("Service restarted");
    }
}
