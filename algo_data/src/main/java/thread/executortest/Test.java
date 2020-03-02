package thread.executortest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();


        Runnable runnable1 = () -> {
            System.out.println("from thread 1. "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }
        };

        Runnable runnable2 = () -> {
            System.out.println("from thread 2. "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }
        };

        executorService.submit(runnable1);
        //executorService.submit(runnable2);
        executorService2.execute(runnable2);

        executorService.shutdown();
        executorService2.shutdown();

    }
}
