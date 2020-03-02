package thread.executortest;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] a){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable runnable1 = () -> {
            System.out.println("Start thread 1: "+new Date());

            System.out.println("from thread 1. "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }

            System.out.println("End thread 1 :"+new Date());
        };

        Runnable runnable2 = () -> {
            System.out.println("Start thread 2: "+new Date());

            System.out.println("from thread 2. "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }

            System.out.println("End thread 2 :"+new Date());
        };

        Runnable runnable3 = () -> {
            System.out.println("Start thread 3: "+new Date());

            System.out.println("from thread 3. "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new IllegalStateException();
            }

            System.out.println("End thread 3 :"+new Date());
        };

        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.submit(runnable3);
        executorService.shutdown();
    }
}
