package damho.src.exam.chapter6.exam5;

import java.time.LocalDateTime;

public class Receiver implements Runnable {
    final Pipe pipe;
    final int maxCount;
    int count;

    public Receiver(Pipe pipe, int maxCount) {
        this.pipe = pipe;
        this.maxCount = maxCount;
        this.count = 0;
    }

    public void run() {
        while (count < maxCount) {
            try {
                int data = pipe.receive();
                System.out.println("[ " + LocalDateTime.now() + " ] Data : " + data);
                count++;

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
