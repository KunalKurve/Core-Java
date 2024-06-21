package Day8.Sync;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    AtomicInteger i = new AtomicInteger();

    public int increment()
    {
        int count = i.incrementAndGet();
        return count;
    }
}
