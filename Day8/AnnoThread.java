package Day8;

public class AnnoThread{
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        Runnable tt = () -> {
            for (int i = 0; i< 10; i++)
            {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

    }
}
