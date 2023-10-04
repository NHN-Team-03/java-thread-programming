package exam05;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver extends Thread {
    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
        for (String receivedMessage = load.receive(); !"End".equals(receivedMessage);
             receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}
