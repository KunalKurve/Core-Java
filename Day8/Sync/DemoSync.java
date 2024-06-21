package Day8.Sync;



public class DemoSync {



    public static void main(String[] args) {

        Counter c = new Counter();

//        Thread one = new Thread( new Runnable() {
//            @Override
//            public void run(){
//
//                    for (int i = 0; i<10 ; i++){
//                        int count = c.increment();
//                        System.out.println(Thread.currentThread().getName() + ": " + count);
////                        try{
////                            Thread.sleep(200);
////                        } catch (InterruptedException e) {
////                            e.printStackTrace();
////                        }
//                    }
//                }
//
//        });

        Thread one = new Thread( new Runnable() {
            @Override
            public void run(){
                synchronized (c) {
                    for (int i = 0; i<50 ; i++){
                        int count = c.increment();
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        try{
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

//        Thread two = new Thread( new Runnable() {
//            @Override
//            public void run(){
//
//                    for (int i = 0; i<10 ; i++){
//                        int count = c.increment();
//                        System.out.println(Thread.currentThread().getName() + ": " + count);
//                        try{
//                            Thread.sleep(200);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//        });
//
//        one.start();
//        two.start();
//    }

        Thread two = new Thread( new Runnable() {
            @Override
            public void run(){
                synchronized (c) {
                    for (int i = 0; i<50 ; i++){
                        int count = c.increment();
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        try{
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        one.start();
        two.start();
    }

}
