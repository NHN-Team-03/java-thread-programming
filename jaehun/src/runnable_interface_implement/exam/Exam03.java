package runnable_interface_implement.exam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import runnable_interface_implement.quiz.RunnableCounter;

public class Exam03 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.execute(new RunnableCounter("counter1", 5));
        pool.execute(new RunnableCounter("counter2", 5));

        pool.shutdown();
        System.out.println("Shutdown called");
        while(!pool.awaitTermination(2, TimeUnit.SECONDS)) {
            System.out.println("Not yet finished");
        }

        System.out.println("All service finished");
    }
}
