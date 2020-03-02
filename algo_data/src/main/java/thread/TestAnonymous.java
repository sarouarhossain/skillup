package thread;

public class TestAnonymous {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("From anonymous thread: "+Thread.currentThread().getName());
            }
        };

        // using lambda
        Runnable runnable1 = () -> {
            System.out.println("From more shortened thread: "+Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("t0");
        t.start();

        Thread t1 = new Thread(runnable1);
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(runnable1);
        t2.setName("t2");
        t2.start();
    }
}
