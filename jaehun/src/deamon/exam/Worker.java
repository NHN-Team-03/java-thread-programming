package deamon.exam;

public class Worker extends RunnableCounter{
    RunnableCounter runnableCounter;

    Worker(String name, int maxCount) {
        super(name, maxCount);
        runnableCounter = new RunnableCounter("internal worker", maxCount);
    }

    @Override
    public void run() {
        runnableCounter.start();

        super.run();
    }
}
