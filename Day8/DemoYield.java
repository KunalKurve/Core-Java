package Day8;

import Day8.Sync.Thread3;

public class DemoYield {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread3());
        Thread t2 = new Thread(new Thread3());
        Thread t3 = new Thread(new Thread3());

        t1.start();
        t2.start();
        t3.start();
    }
}
