package synchronization.exam.exam03;

public class SharedCount {
    static int count;

    private SharedCount(){}

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SharedCount.count = count;
    }

    public synchronized static void increment() {
        setCount(getCount() + 1);
    }
}
