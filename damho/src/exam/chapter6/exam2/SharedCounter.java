package damho.src.exam.chapter6.exam2;

public class SharedCounter extends Thread {
    int maxCount;
    SharedCount sharedCount;
    Thread thread;
    int count;

    public SharedCounter(String name, int maxCount, SharedCount sharedCount) {
        setName(name);
        this.maxCount = maxCount;
        this.sharedCount = sharedCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while(count < maxCount) {
            count++;
            sharedCount.increment();
        }
    }
}
