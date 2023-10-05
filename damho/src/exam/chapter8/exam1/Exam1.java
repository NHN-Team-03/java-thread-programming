package damho.src.exam.chapter8.exam1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import damho.src.exam.chapter8.Worker;

public class Exam1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executor.submit(new Worker("Worker" + i));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("모든 작업 끝.");
    }
}
