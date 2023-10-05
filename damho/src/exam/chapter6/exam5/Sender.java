package damho.src.exam.chapter6.exam5;

public class Sender implements Runnable {
    final Pipe pipe;

    public Sender(Pipe pipe) {
        this.pipe = pipe;
    }

    public void run() {
        for (int i = 0; i < 9; i++) {
            try {
                pipe.send(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
