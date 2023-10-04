package exam03;

public class RunnableCounter implements Runnable {
    Thread thread;
    int count = 0;
    int maxCount;
    long interval = 1000;

    public RunnableCounter(ThreadGroup group, String name, int maxCount) {
        thread = new Thread(group, this, name);
        this.maxCount = maxCount;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
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

    public void join() throws InterruptedException {
        thread.join();
    }

    @Override
    public void run() {

        try {
            while (count < maxCount) {
                increment();
                System.out.println(thread.getName() + " : " + getCount());
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
