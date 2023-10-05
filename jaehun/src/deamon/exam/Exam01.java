package deamon.exam;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException{
        RunnableCounter counter1 = new RunnableCounter("counter1", 100);
        RunnableCounter counter2 = new RunnableCounter("counter2", 10);

        counter2.setDeamon(true);

        counter1.start();
        counter2.start();

        Thread.sleep(1000);
        counter1.stop();

        System.out.println("Main Thread terminated");
    }
}
