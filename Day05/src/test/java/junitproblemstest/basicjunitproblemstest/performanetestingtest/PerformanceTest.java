package junitproblemstest.basicjunitproblemstest.performanetestingtest;
import junitproblems.basicjunitproblems.performancetesting.Performance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {
    @Test
    @Timeout(1)
    public void testLongRunningTaskTimeout() throws InterruptedException {
        Performance.longRunningTask();
    }
}
