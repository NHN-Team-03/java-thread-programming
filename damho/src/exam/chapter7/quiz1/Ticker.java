package damho.src.exam.chapter7.quiz1;

public class Ticker extends Thread {
    int sec;
    boolean isNano;

    public Ticker(int sec, boolean isNano) {
        this.sec = sec;
        this.isNano = isNano;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            long time = System.nanoTime();
            try {
                if (isNano) {
                    Thread.sleep(sec / 1000000, sec % 1000000);
                } else {
                    Thread.sleep(sec);
                }
                System.out.println();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
            System.out.println((System.nanoTime() - time) / 1000000);
        }
    }
}
