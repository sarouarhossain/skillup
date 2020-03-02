package thread;

public class Test {
    public static void main(String[] args){
        System.out.println("hello: "+Thread.currentThread().getName());

//        MyThread myThread = new MyThread("thread 1");
//        myThread.start();

        TestRunnable testRunnable = new TestRunnable();
        Thread t = new Thread(testRunnable);
        t.start();

        Thread t2 = new Thread(testRunnable);
        t2.start();

        Thread t3 = new Thread(testRunnable);
        t3.start();
    }
}
