package yongjun.stop;


public class ThreadUnlimitedCounter extends Thread {
    String name;
    int count;

    public ThreadUnlimitedCounter(String name) {
        this.name = name;
        this.count = 0;
    }

    @Override
    public void run() {
        while (Thread.interrupted()) {
            count++;
            System.out.println(name + ": " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
