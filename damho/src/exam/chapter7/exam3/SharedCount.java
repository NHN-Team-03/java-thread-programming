package damho.src.exam.chapter7.exam3;

public class SharedCount {
    int count;

    public SharedCount(int init) {
        this.count = init;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        setCount(getCount() + 1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {

        }
    }
}
