package Day8;

public class ThreadLambda {

    //



    public static void main(String[] args){


        Runnable r1 = () -> { //run accepts void and returns void
            System.out.println("Runnable with Lambda Expression");
            for (int i = 0; i<10; i++)
            {
                System.out.println("Lambda Runnable Thread: "+ i);
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };


        Thread tL = new Thread(r1);
        tL.start();
        System.out.println(tL.isAlive());
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
            tL.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }



    }
}
