package exam03;

public class SharedCounter implements Runnable {
    private Thread thread;
    private SharedCount sharedCount;
    private int count = 0;
    private int maxCount;
    private long interval;

    public SharedCounter(String name, int maxCount, SharedCount sharedCount) {
        thread = new Thread(this, name);
        this.sharedCount = sharedCount;
        this.maxCount = maxCount;
    }

    public void increment() {
        count++;
        sharedCount.increment();
    }

    public int getCount() {
        return count;
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            while (getCount() < maxCount) {
                increment();
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
