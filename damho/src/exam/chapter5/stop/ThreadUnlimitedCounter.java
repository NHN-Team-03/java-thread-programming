package damho.src.exam.chapter5.stop;

public class ThreadUnlimitedCounter extends Thread {
    String name;
    int count;

    public ThreadUnlimitedCounter(String name) {
        this.name = name;
        count = 0;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                ++count;
                System.out.println(name + " : " + count);
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadUnlimitedCounter("test");
        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
        
    }
}