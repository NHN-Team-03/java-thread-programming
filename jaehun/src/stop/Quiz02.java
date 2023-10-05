package stop;

public class Quiz02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadUnlimitedCounter("counter"));

        thread.start();
        Thread.sleep(5000);
        thread.interrupt();

    }
}
