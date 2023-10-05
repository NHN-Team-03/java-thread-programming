package damho.src.exam.chapter6.exam1;

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

    public void increment() {
        setCount(getCount() + 1);
    }
}
