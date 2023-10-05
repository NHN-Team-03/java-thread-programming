package state.quiz;

public class Quiz02 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 3);
        RunnableCounter counter2 = new RunnableCounter("counter2", 3);

        counter1.start();
        counter2.start();

        counter1.join();
        counter2.join();

        System.out.println("All threads stopped");
    }
}
