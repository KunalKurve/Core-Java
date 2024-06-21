package Day8;

public class DemoThread {

    public  static void main(String[] args){
        Thread1 t1 = new Thread1("Kunal's Thread1"); // creating instance via Thread1 class
        t1.start();

        Thread t2 = new Thread(new Thread2("new Thread 2")); // creating instance via Runnable interface
        t2.start();


        System.out.println(t1.isAlive());
        for (int i = 0; i<10; i++)
        {
            System.out.println("Main Thread: "+ i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        try{
            t1.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
