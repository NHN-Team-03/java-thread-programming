package damho.src.exam.chapter5.stop;

public class ModifiedRunnableCounter implements Runnable {
    static int totalCount = 0;
    Thread thread;
    int maxCount;
    int count;
    boolean running;

    public ModifiedRunnableCounter(int maxCount) {
        this("RunnableCounter-" + totalCount, maxCount);
    }

    public ModifiedRunnableCounter(String name, int maxCount) {
        totalCount++;
        this.maxCount = maxCount;
        this.count = 0;
        this.running = false;
        thread = new Thread(this, name);
    }

    public void stop() {
        this.running = false;
        thread.interrupted();
    }

    public String getName() {
        return thread.getName();
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        this.running = true;
        while (running && count < maxCount) {
            try {
                ++count;
                System.out.println(getName() + " : " + count);
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ModifiedRunnableCounter runnableCounter0 = new ModifiedRunnableCounter(50);
        ModifiedRunnableCounter runnableCounter1 = new ModifiedRunnableCounter(50);

        System.out.println(runnableCounter0.getName());
        System.out.println(runnableCounter1.getName());
        runnableCounter0.start();
        runnableCounter1.start();
        System.out.println(runnableCounter0.getName());
        System.out.println(runnableCounter1.getName());

        Thread.sleep(5000);
        runnableCounter0.stop();
        Thread.sleep(5000);
        runnableCounter1.stop();
    }

}
