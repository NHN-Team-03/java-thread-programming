package runnable_interface_implement.exam;

public class SelfRunnableCounter implements Runnable{
    private int count;
    private int maxCount;
    private Thread thread;

    public SelfRunnableCounter(String name, int maxCount) {
        this.maxCount = maxCount;
        this.count = 0;

        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        while(count < maxCount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println(thread.getName() + " : " + count);
        }
    }

    public void start() {
        thread.start();
    }
}
