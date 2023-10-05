package damho.src.exam.chapter9.exam1;

public class Counter implements Runnable {
    int count;
    String name;
    Thread thread;
    int maxCount;

    public Counter(String name, int maxCount) {
        this.thread = new Thread(this, name);
        this.maxCount = maxCount;
    }

    public void start() {
        thread.start();
    }

    public void setDaemon(boolean flag) {
        thread.setDaemon(flag);
    }

    @Override
    public void run() {
        while (count < maxCount) {
            ++count;
            System.out.println(thread.getName() + ": " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        thread.interrupt();
    }
}
