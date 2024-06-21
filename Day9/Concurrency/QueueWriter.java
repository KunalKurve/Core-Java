package Day9.Concurrency;

import java.util.concurrent.BlockingQueue;

public class QueueWriter implements Runnable
{
    BlockingQueue<String> queue;
    public QueueWriter (BlockingQueue<String> queue)
    {
        this.queue = queue;
    }
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        for (int i=0; i<5; i++)
        {
            queue.add("Element: "+i);
            System.out.println("Thread: "+name+", Add Element: "+i);
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
