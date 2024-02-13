package threads;

import org.junit.Test;

public class DeadlockTest {
    @Test
    public void TestDeadlock() {
        Deadlock evenThread = new Deadlock();
        Deadlock oddThread = new Deadlock();
        evenThread.start();
        oddThread.start();
    }
}