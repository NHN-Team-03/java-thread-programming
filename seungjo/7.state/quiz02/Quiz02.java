package quiz02;

public class Quiz02 {
    public static void main(String[] args) {
        RunnableCounter counter1 = new RunnableCounter("counter1", 3);
        RunnableCounter counter2 = new RunnableCounter("counter2", 5);

        counter1.start();
        counter2.start();

        try {
            counter1.join();
            counter2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All threads stopped");
    }
}
