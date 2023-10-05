package damho.src.exam.chapter6.exam3;

public class SharedCounter extends Thread {
    int maxCount;
    Thread thread;
    int count;

    public SharedCounter(String name, int maxCount) {
        setName(name);
        this.maxCount = maxCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while(count < maxCount) {
            count++;
            SharedCount.increment();
        }
    }
}
