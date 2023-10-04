package exam01;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 100);
        RunnableCounter counter2 = new RunnableCounter("counter2", 100);

        counter2.setDaemon(true);

        counter1.start();
        counter2.start();

        Thread.sleep(5000);
        counter1.stop();

        Thread.sleep(2000);

        System.out.println();

        Thread.State state1 = counter1.getThread().getState();
        Thread.State state2 = counter2.getThread().getState();
        System.out.println("counter1 state: " + state1);
        System.out.println("counter2 state: " + state2);

        System.out.println("Main Thread terminated");
    }
}