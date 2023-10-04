package exam03;

public class SharedCounter extends Thread {
    private int count;
    private int maxCount;

    public SharedCounter(String name, int maxCount) {
        setName(name);
        this.maxCount = maxCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            SharedCount.increment();
        }
    }
}
