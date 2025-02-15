package junitproblems.basicjunitproblems.performancetesting;

public class Performance {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(100);
        return "Task Completed";
    }
}
