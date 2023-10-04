package exam01;

public class RunnableCounter implements Runnable {
    Thread thread;
    int count = 0;
    int maxCount;
    long interval = 1000;

    public RunnableCounter(String name, int maxCount) {
        thread = new Thread(this, name);
        this.maxCount = maxCount;
    }

    public int getCount() {
        return this.count;
    }

    public void increment() {
        count++;
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public void setDaemon(boolean on) {
        thread.setDaemon(on);
    }

    public Thread getThread() {
        return this.thread;
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    @Override
    public void run() {
        try {
            while(count < maxCount) {
                increment();
                System.out.println(thread.getName() + " : " + getCount());
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
