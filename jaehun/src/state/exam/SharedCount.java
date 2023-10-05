package state.exam;

public class SharedCount {
    private int count = 0;

    public synchronized void increment() {
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getCount() {
        return count;
    }

}
