package runnable_interface_implement.quiz;

public class RunnableCounter implements Runnable{
    private String name;
    private int count;
    private int maxCount;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        count = 0;
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
            System.out.println(name + " : " + count);
        }
    }

}
