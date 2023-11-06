package yongjun.runnable_interface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exam3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.execute(new RunnableCounter("Counter1", 10));
        pool.execute(new RunnableCounter("Counter2", 10));

        pool.shutdown();
        System.out.println("Shutdown called");
        while (!pool.awaitTermination(2, TimeUnit.SECONDS)) {
            System.out.println("Not yet finished");
        }
        System.out.println("All service finished");
    }
}
