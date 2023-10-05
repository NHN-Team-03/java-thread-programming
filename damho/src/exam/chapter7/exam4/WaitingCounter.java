package damho.src.exam.chapter7.exam4;

public class WaitingCounter implements Runnable {
    Thread thread;
    Counter counter;

    public WaitingCounter(Counter counter) {
        thread = new Thread(this);
        this.counter = counter;
    }

    public void start() {
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public boolean isAlive() {
        return thread.isAlive();
    }

    @Override
    public void run() {
        try {
            counter.join();
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
