package damho.src.exam.chapter7.exam4;

public class Exam4 {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        WaitingCounter waitingCounter = new WaitingCounter(counter);

        counter.start();
        waitingCounter.start();

        Thread.State state = waitingCounter.getThread().getState();
        System.out.println(state);

        while (waitingCounter.isAlive()) {
            if (state != waitingCounter.getThread().getState()) {
                state = waitingCounter.getThread().getState();
                System.out.println(state);
            }
        }
    }
}
