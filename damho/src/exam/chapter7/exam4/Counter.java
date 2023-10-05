package damho.src.exam.chapter7.exam4;

public class Counter extends Thread {
    int count;
    int maxCount;

    public Counter(int maxCount) {
        this.count = 0;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {

            }
        }
    }
}
