package yongjun.runnable_interface;

public class RunnableCounter implements Runnable{
    String name;
    int count;
    int maxCount;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.count = 0;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        for (count = 0; count < maxCount; count++) {
            System.out.println(name+": "+ count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
