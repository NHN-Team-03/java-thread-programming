package damho.src.exam.chapter6.exam5;

public class Pipe {
    private int data;
    private boolean empty = true;

    public synchronized int receive() throws InterruptedException {
        while (empty) {
            wait();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }

        int tmp = data;
        empty = !empty;

        notify();
        // notifyAll();
        return tmp;
    }

    public synchronized void send(int data) throws InterruptedException {
        while (!empty) {
            wait();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }

        this.data = data;
        empty = !empty;
        notify();
        // notifyAll();
    }
}
