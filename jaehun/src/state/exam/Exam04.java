package state.exam;

public class Exam04 {
    public static void main(String[] args) {
        RunnableCounter rc = new RunnableCounter("counter", 10);
        WaitingCounter wc = new WaitingCounter(rc);

        rc.start();
        wc.start();

        Thread.State state = wc.getThread().getState();

        System.out.println(state);

        while(wc.isAlive()) {
            if(wc.getThread().getState() != state) {
                state = wc.getThread().getState();

                System.out.println(state);
            }
        }
    }
}
