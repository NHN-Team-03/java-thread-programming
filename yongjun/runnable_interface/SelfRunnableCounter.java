package yongjun.runnable_interface;

public class SelfRunnableCounter implements Runnable{
    String name;
    int count;
    int maxCount;
    Thread thread;


    public SelfRunnableCounter(String name, int maxCount) {
        this.name = name;
        this.count = 0;
        this.maxCount = maxCount;
        thread = new Thread(this, name);
    }

    public void start(){
        this.thread.start();
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
