package Assignment6.Submit;

public class syncArrayMain {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {10,20,30,40,50};
        countArray s = new countArray();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                 synchronized (s)
                 {
                     System.out.print(Thread.currentThread().getName());
                     int c = s.printArray(arr1);
                     System.out.print(": "+c);
                     try {
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    System.out.println();
                    System.out.print(Thread.currentThread().getName());
                    int c = s.printArray(arr2);
                    System.out.print(": "+c);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        t1.start();

        t2.start();
    }
}
