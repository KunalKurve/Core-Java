package Day8;

public class Thread2 implements Runnable{
    String name;
    public Thread2(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(name + " " + i);
            try{
                Thread.sleep(2000);

            }
            catch
            (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
