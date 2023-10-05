package damho.src.exam.chapter8;

public class Worker implements Runnable {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(this.name + " finished");
    }
}
