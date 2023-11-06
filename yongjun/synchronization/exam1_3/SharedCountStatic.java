package yongjun.synchronization.exam1_3;

public class SharedCountStatic {
    static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SharedCountStatic.count = count;
    }

    public static synchronized void increment() {
        setCount(getCount() + 1);
    }
}