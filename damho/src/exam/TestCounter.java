package damho.src.exam;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        // CounterThread counterThread1 = new CounterThread("CounterThread1");
        // CounterThread counterThread2 = new CounterThread("CounterThread2", 5);

        // CounterRunnable counterRunnable1 = new CounterRunnable("CounterRunnable1");
        // CounterRunnable counterRunnable2 = new CounterRunnable("CounterRunnable2");
        // Thread thread1 = new Thread(counterRunnable1);
        // Thread thread2 = new Thread(counterRunnable2);

        // thread1.start();
        // thread2.start();

        RunnableCounter runnableCounter = new RunnableCounter("RunnableCounter", 10);
        Thread thread = new Thread(runnableCounter);

        thread.start();
    }
}
