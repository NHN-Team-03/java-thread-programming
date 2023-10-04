package exam02;

import exam01.RunnableCounter;

public class Worker extends RunnableCounter {

    RunnableCounter counter;

    public Worker(String name, int maxCount) {
        super(name, maxCount);
        counter = new RunnableCounter("internal worker", maxCount);
        counter.setDaemon(true);
    }

    @Override
    public void run() {
        counter.start();
        super.run();
    }
}
