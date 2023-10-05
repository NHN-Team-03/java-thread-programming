package state.exam;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter rc = new RunnableCounter("counter", 10);

        rc.start();
        System.out.println(rc.getThread().getState());
    }
}
