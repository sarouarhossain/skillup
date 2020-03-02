package thread;

public class TestSleepJoin {
    public static void main(String[] a){
        Thread t1 = new Thread(()->{
            System.out.println("Entered thread 1");
            try {
                Thread.sleep(4000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }

            System.out.println("Exit from thread 1");
        });

        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("Entered thread 2");
            try {
                Thread.sleep(4000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }

            System.out.println("Exit from thread 2");
        });

        try {
            t1.join();
        }catch (InterruptedException e){
            throw new IllegalStateException();
        }

        t2.start();
    }
}
