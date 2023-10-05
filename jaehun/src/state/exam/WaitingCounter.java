package state.exam;

public class WaitingCounter implements Runnable{
    private Thread thread;
    RunnableCounter rc;

    public WaitingCounter(RunnableCounter rc) {
        thread = new Thread(this);
        this.rc = rc;
    }

    public void start() {
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public boolean isAlive() {
        return thread.isAlive();
    }

    @Override
    public void run() {
        try {
            rc.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
