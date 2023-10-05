package stop;

public class RunnableCounter implements Runnable{
    private String name;
    private int count;
    private int maxCount;
    private boolean runningFlag;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        count = 0;
        runningFlag = true;
    }

    @Override
    public void run() {
        while(count < maxCount) {
            if(!runningFlag) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println(name + " : " + count);
        }

    }

    public void waiting() {
        runningFlag = false;
    }

    public void restart() {
        runningFlag = true;
        run();
    }

}