package state.exam;

public class SharedCounter implements Runnable{
    private Thread thread;
    private SharedCount sharedCount;
    private int count = 0;
    private int maxCount;

    public SharedCounter(String name, int maxCount, SharedCount sharedCount) {
        thread = new Thread(this, name);
        this.maxCount = maxCount;
        this.sharedCount = sharedCount;
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
            while(getCount() < maxCount) {
                increment();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
