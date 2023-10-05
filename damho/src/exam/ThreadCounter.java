package damho.src.exam;

public class ThreadCounter extends Thread {
    String name;
    int count;

    public ThreadCounter(String name) {
        this(name, 0);
    }

    public ThreadCounter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println(this.name +  ":" + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
