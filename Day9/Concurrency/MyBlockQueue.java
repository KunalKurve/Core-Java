package Day9.Concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyBlockQueue
{
    public static void main(String[] args) {
        BlockingQueue<String> name = new ArrayBlockingQueue<>(10);
        Executor service = Executors.newFixedThreadPool(4);

        for (int i=0; i<10;i++)
        {
            service.execute(new QueueReader(name));
            service.execute(new QueueWriter(name));
        }
    }
}
