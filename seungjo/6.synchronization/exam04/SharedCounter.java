package exam04;

public class SharedCounter extends Thread {
    SharedCount sharedCount;
    private int count;
    private int maxCount;

    public SharedCounter(String name, int maxCount, SharedCount sharedCount) {
        setName(name);
        this.sharedCount = sharedCount;
        this.maxCount = maxCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            synchronized (sharedCount) {
                sharedCount.increment();
            }
        }
    }
}
