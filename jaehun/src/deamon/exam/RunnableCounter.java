package deamon.exam;

public class RunnableCounter implements Runnable {
    private Thread thread;
    private int count;
    private int maxCount;

    public RunnableCounter(ThreadGroup group, String name, int maxCount) {
        thread = new Thread(group, this, name);
        this.maxCount = maxCount;
    }

    public RunnableCounter(String name, int maxCount) {
        thread = new Thread(this, name);
        count = 0;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            try {
                Thread.sleep(1000);
                this.increment();
                System.out.println(thread.getName() + " : " + this.getCount());
                System.out.println(thread.getState());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(thread.getName() + " stopped");
    }

    public void start() {
        thread.start();
    }

    public int getCount() {
        return count;
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

    public void increment() {
        count++;
    }

    public void setDeamon(boolean on) {
        thread.setDaemon(on);
    }
}
