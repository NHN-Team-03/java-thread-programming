package stop;

public class ThreadUnlimitedCounter implements Runnable{
    private String name;
    private int count;

    public ThreadUnlimitedCounter(String name) {
        this.name = name;
        count = 0;
    }

    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Thread.sleep(1000);

                count++;
                System.out.println(name + " : " + count);
            }
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
