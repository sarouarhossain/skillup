package thread;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("from runnable: "+Thread.currentThread().getName());
    }
}
