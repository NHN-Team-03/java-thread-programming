package state.quiz;

public class Ticker implements Runnable{
    private Thread thread;
    private int tick;

    public Ticker(String name, String ticks) {
        thread = new Thread(this, name);
        if(ticks.indexOf("n") < 0) {
            tick = Integer.parseInt(ticks);
        } else {
            tick = Integer.parseInt(ticks.substring(0, ticks.length() -1)) / 1000;
        }
    }

    public Thread getThread() {
        return thread;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        while(!Thread.interrupted()) {
            try {
                long start = System.currentTimeMillis();
                Thread.sleep(tick);
                long end = System.currentTimeMillis();

                System.out.println(end - start);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
