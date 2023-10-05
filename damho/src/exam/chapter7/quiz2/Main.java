package damho.src.exam.chapter7.quiz2;

import damho.src.exam.RunnableCounter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 3);
        RunnableCounter counter2 = new RunnableCounter("counter2", 3);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        

        System.out.println("All threads stopped");
    }
}
