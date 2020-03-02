package thread.callablefuture;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "hello";
            }
        };

        Callable<Integer> callable1 = () -> {
            Thread.sleep(2000);
            return 500;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(callable);

        Future<Integer> future1 = executorService.submit(callable1);
        System.out.println(future1.get());
        System.out.println(future.get());

        executorService.shutdown();

    }
}
