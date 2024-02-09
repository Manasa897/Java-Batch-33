package threads;

import org.junit.Test;
import threads.OddandEven;

public class OddandEvenTest {
    @Test
    public void oddandeventest() {
        OddandEven evenThread = new OddandEven();
        OddandEven oddThread = new OddandEven();
        evenThread.start();
        oddThread.start();
    }
}