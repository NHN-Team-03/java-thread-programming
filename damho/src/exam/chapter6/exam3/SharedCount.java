package damho.src.exam.chapter6.exam3;

public class SharedCount {
    private SharedCount() {
    }

    static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int change) {
        count = change;
    }

    public synchronized static void increment() {
        setCount(getCount() + 1);
    }
}
