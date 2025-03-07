package synchronization.exam.exam03;


public class Exam03 {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter1 = new SharedCounter("counter1", 50000);
        SharedCounter counter2 = new SharedCounter("counter2", 50000);

        counter1.start();
        counter2.start();

        System.out.println(counter1.getName() + ": started");
        System.out.println(counter2.getName() + ": started");

        counter1.join();
        counter2.join();

        System.out.println(counter1.getName() + ": terminated");
        System.out.println(counter2.getName() + ": terminated");

        System.out.println(SharedCount.getCount());
    }
}
